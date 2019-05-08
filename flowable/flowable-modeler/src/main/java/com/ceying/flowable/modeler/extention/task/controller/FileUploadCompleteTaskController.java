package com.ceying.flowable.modeler.extention.task.controller;

import com.alibaba.fastjson.JSONObject;
import com.ceying.common.enums.ExceptionCodeEnum;
import com.ceying.common.util.properties.MessageUtil;
import com.ceying.common.util.response.BaseReturnResult;
import com.ceying.eagleeye.common.log.MyLogger;
import com.ceying.flowable.modeler.app.task.service.runtime.FlowableTaskActionService;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: fej
 * @date: 2018/5/24
 * @description :
 * @version: 2.0
 */
@RestController
@RequestMapping("/workflow")
public class FileUploadCompleteTaskController {

    @Autowired
    private FlowableTaskActionService flowableTaskActionService;

    @Autowired
    private MyLogger myLogger;

    @RequestMapping("/complete/task/add/description.do")
    public BaseReturnResult completeTaskAndAddDescription(@RequestBody Map<String,Object> extendVariable){
        Map<String, Object> map = null;
        String taskId = extendVariable.get("taskId").toString();
        String description = (extendVariable.get("description")==null || extendVariable.get("description").toString().equals(""))?null:extendVariable.get("description").toString();
        Object condition = extendVariable.get("conditionExpression");
        if(condition != null && !"null".equals(condition.toString())){
            String conditionExpression = condition.toString();
            map = dealingWithCondition(conditionExpression);
        }
        extendVariable.remove("taskId");
        extendVariable.remove("conditionExpression");
        extendVariable.remove("description");
        //执行成功返回结果
        Map<String,Object> resultMap = null;
        //返回执行成功结果的字段
        List<String> successList = new ArrayList<>();
        successList.add("successCode");
        successList.add("successMessage");
        try {
            resultMap = flowableTaskActionService.completeTaskAndAddDes(taskId, map, "extendVariable", extendVariable, successList,description);
        }catch (Exception e){
            e.printStackTrace();
            return exception(e);
        }
        if(resultMap != null) {
            String successCode = resultMap.get(successList.get(0)) == null ? null : resultMap.get(successList.get(0)).toString();
            String successMessage = resultMap.get(successList.get(1)) == null ? null : resultMap.get(successList.get(1)).toString();
            if (StringUtils.hasText(successCode) && StringUtils.hasText(successMessage)) {
                return MessageUtil.Success(successCode, successMessage);
            }
        }
        return MessageUtil.Success();
    }

    @RequestMapping("/file/upload/no/success.do")
    public Object fileUploadNoSuccess(HttpServletRequest request, @RequestParam("taskId") String taskId){
        List<Map<String,Object>> resultList = null;
        try {
            resultList = flowableTaskActionService.fileUpload(request,taskId);
        }catch (Exception e){
            e.printStackTrace();
            return exception(e);
        }
        return resultList;
    }



    @RequestMapping("/file/upload/having/success.do")
    public BaseReturnResult fileUploadHavingSuccess(HttpServletRequest request, @RequestParam("taskId") String taskId){
        try {
            flowableTaskActionService.fileUpload(request,taskId);
        }catch (Exception e){
            e.printStackTrace();
            return exception(e);
        }
        return MessageUtil.Success();
    }

    @RequestMapping("/file/delete.do")
    public BaseReturnResult fileUpload(@RequestParam("attachmentId") String attachmentId){
        flowableTaskActionService.deleteAttachment(attachmentId);
        return MessageUtil.Success();
    }

    private Map dealingWithCondition(String condition){
        Map<String, Object> map = new HashMap<>();
        String[] arr = condition.replaceAll("\\{", "").replaceAll("}", "").replaceAll("\'", "").replaceAll("\"", "").replaceAll("\\$", "").split("==");
        map.put(arr[0], arr[1]);
        return map;
    }

    /**
     * 处理feign调用异常
     * @param e
     * @return
     */
    private BaseReturnResult exception(Exception e){
        BaseReturnResult baseReturnResult = new BaseReturnResult();
        baseReturnResult.setSuccess(false);
        if(e instanceof FeignException){
            String errorMessage = e.getMessage();
            String[] errorArray = errorMessage == null ? null : errorMessage.split(";");
            if(errorArray != null && errorArray.length > 1) {
                JSONObject jsonObject = JSONObject.parseObject("{" + errorArray[1] + "}");
                JSONObject subJsonObject = (JSONObject) jsonObject.get("content");
                String errorCode = subJsonObject.get("message") == null ? "" : subJsonObject.get("message").toString();
                baseReturnResult.setMsg(errorCode);
                for (ExceptionCodeEnum exceptionCodeEnum : ExceptionCodeEnum.values()) {
                    if (exceptionCodeEnum.getKey().equals(errorCode)) {
                        baseReturnResult.setCode(errorCode);
                        baseReturnResult.setMsg(exceptionCodeEnum.getValue());
                        break;
                    }
                }
            }
        }else {
            baseReturnResult.setMsg(e.getMessage());
        }
        myLogger.error(baseReturnResult.getMsg(),e);
        return baseReturnResult;
    }
}
