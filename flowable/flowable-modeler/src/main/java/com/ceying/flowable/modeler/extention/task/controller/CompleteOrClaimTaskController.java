package com.ceying.flowable.modeler.extention.task.controller;

import com.alibaba.fastjson.JSONObject;
import com.ceying.common.enums.ExceptionCodeEnum;
import com.ceying.common.util.properties.MessageUtil;
import com.ceying.common.util.response.BaseReturnResult;
import com.ceying.eagleeye.common.log.MyLogger;
import com.ceying.flowable.modeler.app.task.service.runtime.FlowableTaskActionService;
import feign.FeignException;
import org.flowable.engine.HistoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: cyp
 * Date: 2018-03-02
 * Time: 10:21
 */
@Controller
@RequestMapping("/workflow")
public class CompleteOrClaimTaskController {

    @Autowired
    private FlowableTaskActionService flowableTaskActionService;

    @Autowired
    protected TaskService taskService;

    @Autowired
    protected RuntimeService runtimeService;

    @Autowired
    protected HistoryService historyService;

    @Autowired
    private MyLogger myLogger;

    @ResponseBody
    @RequestMapping("/save/complete/task.do")
    public BaseReturnResult completeTask(@RequestBody Map<String,Object> extendVariable){
        Map<String, Object> map = null;
        String taskId = extendVariable.get("taskId").toString();
        Object condition = extendVariable.get("conditionExpression");
        if(condition != null && !"null".equals(condition.toString())){
            String conditionExpression = condition.toString();
            map = dealingWithCondition(conditionExpression);
        }
        extendVariable.remove("taskId");
        extendVariable.remove("conditionExpression");
        //执行成功返回结果
        Map<String,Object> resultMap = null;
        //返回执行成功结果的字段
        List<String> successList = new ArrayList<>();
        successList.add("successCode");
        successList.add("successMessage");
        try {
            resultMap = flowableTaskActionService.claimAndCompleteTaskReturnSuccessMessage(taskId, map, "extendVariable", extendVariable, successList);
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

    @ResponseBody
    @RequestMapping("/batch/complete/task.do")
    public BaseReturnResult completeTaskBatch(@RequestBody Map<String,Object> extendVariable){
        String taskIds = extendVariable.get("taskIds").toString();
        Object condition = extendVariable.get("condition");
        Map<String, Object> map = null;
        if(condition != null && !"null".equals(condition.toString())){
            String conditionExpression = condition.toString();
            map = dealingWithCondition(conditionExpression);
        }
        String[] taskArray = taskIds.split(",");

        //执行成功返回结果
        Map<String,Object> resultMap = null;
        //返回执行成功结果的字段
        List<String> successList = new ArrayList<>();
        successList.add("successCode");
        successList.add("successMessage");
        try{
            for(String taskId : taskArray){
                resultMap = flowableTaskActionService.claimAndCompleteTaskReturnSuccessMessage(taskId,map,"",null, successList);
            }
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

    @Deprecated
    @ResponseBody
    @RequestMapping("/save/claim/task.do")
    public Map claimTask(@RequestParam("taskId")String taskId){
        flowableTaskActionService.claimTask(taskId);
        Map<String,String> map = new HashMap<String,String>();
        map.put("success","true");
        return map;
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
