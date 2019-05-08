package com.ceying.eagleeye.common.service;

import com.alibaba.fastjson.JSONObject;
import com.ceying.eagleeye.common.config.MyLogConfig;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/28<br>
 * <br>
 */
@Service
public class MylogService {
    @Autowired
    private MyLogConfig myLogConfig;

    private static final Logger log = LoggerFactory.getLogger(MylogService.class);

    /**
     * 写入文件
     * @param user
     * @param data
     */
    public void writrFile(String user,String data){
        String date=JSONObject.parseObject(data).get("date").toString().split(" ")[0];
        String path=myLogConfig.getFilePath();
        String fileName=myLogConfig.getFileName();
        path=path.replaceAll("\\{yyyy-MM-dd\\}",date);
        path=path.replaceAll("\\{user\\}",user);
        fileName=fileName.replaceAll("\\{yyyy-MM-dd\\}",date);
        fileName=fileName.replaceAll("\\{user\\}",user);
        try {
            File myFilePath = getWriteFile(path,fileName);
            FileWriter resultFile = new FileWriter(myFilePath,true);
            PrintWriter myFile = new PrintWriter(resultFile);
            myFile.println(data);
            resultFile.close();
        }
        catch (Exception e) {
            log.debug("文件读写出错",e);
        }
    }

    /**
     * 读取文件
     * @param path
     * @param fileName
     * @param rows
     * @param page
     * @return
     */
    public JSONObject readFile(String path, String fileName, int rows, int page){
        String file=path+ File.separator+fileName;
        JSONObject json=new JSONObject();
        try {
            List<Object> list=new ArrayList<>();
            list=getReadFile(path,fileName,rows,page);
            json.put("rows",list);
            json.put("page",page);
            int total=getFileLineNumber(path,fileName);
            int totalpage= (int) Math.ceil(total/(double)rows);
            json.put("totalpage",totalpage);
            json.put("total",total);
        } catch (Exception e) {
            log.debug("文件读写出错",e);
        }
        return json;
    }

    /**
     * 获取目录下 文件的总行数
     * @param path
     * @param fileName
     * @return
     * @throws Exception
     */
    public int getFileLineNumber(String path, String fileName) throws Exception{
        String fileUrl=path+ File.separator+fileName;
        List<File> list= (List<File>) FileUtils.listFilesAndDirs(new File(path),new WildcardFileFilter(fileName+"*"),null);
        int lineNumber=0;
        for(File f:list){
            lineNumber+=getOneFileLineNumber(f);
        }
        return lineNumber;
    }

    /**
     * 获取单个文件的总行数 默认最后一行为空行 减去
     * @param file
     * @return
     * @throws Exception
     */
    public int getOneFileLineNumber(File file) throws Exception{
        int lineNumber=0;
        if(file.isFile()){
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
            lineNumberReader.skip(Long.MAX_VALUE);
            lineNumber = lineNumberReader.getLineNumber();
            lineNumberReader.close();
        }
        return lineNumber;
    }

    private File getWriteFile(String path,String fileName) throws IOException {
        File file=new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        File txtFile=new File(path+ File.separator+fileName);
        if (!txtFile.exists()) {
            txtFile.createNewFile();
        }
        File resultFile=null;
        List<File> list= (List<File>) FileUtils.listFilesAndDirs(file,new WildcardFileFilter(fileName+"*"),null);
        for(File f:list){
            if(f.isFile()){
                if(FileUtils.sizeOf(f)<(myLogConfig.getFileSize()*1024*1024)){
                    resultFile=f;
                }
            }
        }
        if(resultFile==null){
            resultFile=new File(path+ File.separator+fileName+list.size());
            if (!resultFile.exists()) {
                resultFile.createNewFile();
            }
        }
        return resultFile;
    }

    private List<Object> getReadFile(String path,String fileName,int rows, int page) throws Exception {
        int startLine=rows*(page-1);
        int endLine=rows*page;
        List<Object>resultFilelist=new ArrayList<>();
        File fileDire=new File(path);
        List<File> list= (List<File>) FileUtils.listFilesAndDirs(fileDire,new WildcardFileFilter(fileName+"*"),null);
        int tmpLineNumb=0;
        Collections.sort(list, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(int i=0;i<list.size();i++){
            File tmpfile=list.get(i);
            if(tmpfile.isFile()){
                int fileLinenumber=getOneFileLineNumber(tmpfile);
                if(tmpLineNumb>=endLine){
                    break;
                }
                if((tmpLineNumb+fileLinenumber)>startLine){
                    LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(tmpfile));
                    int skipLine=startLine-tmpLineNumb;
                    int thisEndLine=endLine-tmpLineNumb;
                    for(int j=0;j<fileLinenumber;j++){
                        if(j>thisEndLine){
                            break;
                        }
                        String s=lineNumberReader.readLine();
                        if(j>=skipLine){
                            resultFilelist.add(JSONObject.parse(s));
                        }
                    }
                    lineNumberReader.close();
                }
                tmpLineNumb+=fileLinenumber;
            }
        }
        return resultFilelist;
    }
}
