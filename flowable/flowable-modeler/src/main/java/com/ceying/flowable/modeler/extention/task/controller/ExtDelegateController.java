package com.ceying.flowable.modeler.extention.task.controller;

import com.ceying.common.base.CypRowSet;
import com.ceying.common.util.properties.MessageUtil;
import com.ceying.common.util.response.BaseReturnResult;
import com.ceying.flowable.modeler.app.task.model.ResultListGridDataEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateEntity;
import com.ceying.flowable.modeler.extention.task.service.ExtDelegateService;
import com.ceying.flowable.modeler.extention.task.vo.ExtDelegateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: fej
 * @date: 2018/5/29
 * @description :
 * @version: 2.0
 */
@RestController
@RequestMapping("/delegate")
public class ExtDelegateController {

    @Autowired
    private ExtDelegateService extDelegateService;

    @RequestMapping("/list.do")
    public ResultListGridDataEntity listExtDelegate(ExtDelegateVO extDelegateVO){
        return extDelegateService.listExtDelegate(extDelegateVO);
    }

    @RequestMapping("/save.do")
    public BaseReturnResult insert(@RequestBody ExtDelegateEntity extDelegateEntity){
        try {
            extDelegateService.insert(extDelegateEntity);
        }catch (Exception e){
            return MessageUtil.Exception(e);
        }
        return MessageUtil.Success();
    }

    @RequestMapping("/delete.do")
    public BaseReturnResult delete(@RequestParam("ids") String ids){
        try {
            extDelegateService.delete(ids.split(","));
        }catch (Exception e){
            return MessageUtil.Exception(e);
        }
        return MessageUtil.Success();
    }

    @RequestMapping("/update.do")
    public BaseReturnResult update(@RequestBody ExtDelegateEntity extDelegateEntity){
        try {
            extDelegateService.update(extDelegateEntity);
        }catch (Exception e){
            return MessageUtil.Exception(e);
        }
        return MessageUtil.Success();
    }

    @RequestMapping("/batch/update.do")
    public BaseReturnResult batchUpdate(@RequestParam("ids") String ids, @RequestParam("taskState") String taskState){
        try {
            extDelegateService.batchUpdate(ids.split(","),taskState);
        }catch (Exception e){
            return MessageUtil.Exception(e);
        }
        return MessageUtil.Success();
    }

    @RequestMapping("/get.do")
    public ResultListGridDataEntity get(@RequestParam("id") String id){
        return extDelegateService.getExtDelegate(id);
    }

    @RequestMapping("/check.do")
    public BaseReturnResult check(@RequestParam("userId") String userId, @RequestParam("delegateType") String delegateType, @RequestParam(value = "processKeys", required = false) String processKeys){
        Integer count = extDelegateService.check(userId, delegateType, StringUtils.hasText(processKeys)?processKeys.split(","):null);
        if(count == 0){
            return MessageUtil.Success();
        }
        BaseReturnResult baseReturnResult = new BaseReturnResult();
        baseReturnResult.setSuccess(false);
        return baseReturnResult;
    }
}
