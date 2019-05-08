package com.ceying.flowable.modeler.extention.task.controller;

import com.ceying.common.util.properties.MessageUtil;
import com.ceying.common.util.response.BaseReturnResult;
import com.ceying.flowable.modeler.app.task.model.ResultListGridDataEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateDetailEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateEntity;
import com.ceying.flowable.modeler.extention.task.service.ExtDelegateDetailService;
import com.ceying.flowable.modeler.extention.task.service.ExtDelegateService;
import com.ceying.flowable.modeler.extention.task.vo.ProcessDefinitionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: fej
 * @date: 2018/5/29
 * @description :
 * @version: 2.0
 */
@RestController
@RequestMapping("/delegate/detail")
public class ExtDelegateDetailController {

    @Autowired
    private ExtDelegateDetailService extDelegateDetailService;

    @RequestMapping("/list.do")
    public ResultListGridDataEntity listExtDelegateDetail(ExtDelegateDetailEntity extDelegateDetailEntity){
        return extDelegateDetailService.listExtDelegateDetail(extDelegateDetailEntity);
    }

    @RequestMapping("/process-key-name/list.do")
    public ResultListGridDataEntity listExtDelegateDetailAndKeyName(ExtDelegateDetailEntity extDelegateDetailEntity){
        return extDelegateDetailService.listExtDelegateDetailAndKeyName(extDelegateDetailEntity);
    }

    @RequestMapping("/can-add/list.do")
    public ResultListGridDataEntity listUnSavedProcessDefinition(ProcessDefinitionVO processDefinitionVO){
        return extDelegateDetailService.listUnSavedProcessDefinition(processDefinitionVO);
    }

    @RequestMapping("/save.do")
    public BaseReturnResult insert(ExtDelegateDetailEntity extDelegateDetailEntity){
        try {
            extDelegateDetailService.insert(extDelegateDetailEntity);
        }catch (Exception e){
            return MessageUtil.Exception(e);
        }
        return MessageUtil.Success();
    }

    @RequestMapping("/batch/save.do")
    public BaseReturnResult batchSave(@RequestParam("processKey") String processKey, @RequestParam("delegateId") String delegateId){
        try {
            extDelegateDetailService.insert(processKey.split(","), delegateId);
        }catch (Exception e){
            return MessageUtil.Exception(e);
        }
        return MessageUtil.Success();
    }

    @RequestMapping("/delete.do")
    public BaseReturnResult delete(@RequestParam("ids") String ids){
        try {
            extDelegateDetailService.delete(ids.split(","));
        }catch (Exception e){
            return MessageUtil.Exception(e);
        }
        return MessageUtil.Success();
    }

    @RequestMapping("/update.do")
    public BaseReturnResult update(ExtDelegateDetailEntity extDelegateDetailEntity){
        try {
            extDelegateDetailService.update(extDelegateDetailEntity);
        }catch (Exception e){
            return MessageUtil.Exception(e);
        }
        return MessageUtil.Success();
    }

    @RequestMapping("/get.do")
    public ExtDelegateDetailEntity get(@RequestParam("id") String id){
        return extDelegateDetailService.getExtDelegateDetail(id);
    }
}
