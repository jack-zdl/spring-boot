package com.ceying.chx.cpi.base.config;

import org.apache.log4j.Logger;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 功能说明: 动态加载配置文件<br>
 * 系统版本: 2.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2018/1/9 16:27<br>
 * <br>
 */

public class SysProperties implements Runnable{

    private static Logger log = Logger.getLogger(SysProperties.class);

    private Map<String,Long> configFileModifyDate = new HashMap<String, Long>();
    /**
     * 系统配置文件，包含系统classpath目录下config*.properties中的内容，5秒钟检查一次，如果有变化自动重新加载。
     */
    public static Map<String,String> SYSTEM_CONFIG = new ConcurrentHashMap<String,String>();

    //配置文件路径
    private static String defaultPropFileName = "/resources";

    @Override
    public void run() {
        int checkDely= 5*1000 ;     // 配置文件自动检查间隔；
        int beginDely = 10*1000;    // 1分钟后运行配置文件自动检查功能。
        try {
            Thread.sleep(beginDely);
            log.info("启动 配置文件检查 线程，当前检测频率："+checkDely);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        while(true){
            try {
                this.loadAllConfigFiles();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                Thread.currentThread();
                Thread.sleep(checkDely);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 检查系统配置文件，并更新全局变量 。
     * @throws Exception
     * @date 2012-8-31
     */
    private void loadAllConfigFiles(){
        String tempPath = this.getClass().getResource(defaultPropFileName).getFile();
        File fileDir = new File(tempPath);

        fileDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                try {
                    String name = file.getName();
                    String fullPath = file.getAbsolutePath();

                    if(name.matches("^sys.*\\.properties$")){//properties
                        Long value = configFileModifyDate.get(fullPath);
                        if(value==null || value.longValue()!=file.lastModified()){
                            log.info("加载配置文件："+file);
                            loadPropertieFile(file);
                            configFileModifyDate.put(fullPath,file.lastModified());
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return false;
            }
        });

    }

    /**
     * 加载配置文件到SYSTEM_CONFIG
     * @date 2012-8-31
     * @param configFile 系统配置文件以 sys*.properties命名。
     */
    private void loadPropertieFile(File configFile) {
        try {
            Properties properties = PropertiesLoaderUtils.loadProperties(new FileSystemResource(configFile));
            for(String key:properties.stringPropertyNames()){
                String value=properties.getProperty(key);

                log.info("load property:"+ key+"->"+value);
                SYSTEM_CONFIG.put(key,value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SysProperties sys = new SysProperties();
        sys.run();
    }
}
