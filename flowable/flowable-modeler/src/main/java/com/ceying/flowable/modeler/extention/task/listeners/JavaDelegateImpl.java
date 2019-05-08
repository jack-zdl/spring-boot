package com.ceying.flowable.modeler.extention.task.listeners;

import com.ceying.flowable.modeler.app.modeler.security.SecurityUtils;
import org.flowable.engine.common.api.delegate.Expression;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: cyp
 * Date: 2018-01-17
 * Time: 17:16
 */
@Component("javaDelegate")
public class JavaDelegateImpl implements JavaDelegate {

    private Expression filedName;

    public void execute(DelegateExecution execution) {
        Object beanName = filedName.getValue(execution);
        if(beanName == null){
            return;
        }
        Map<String,Object> variables = execution.getVariables();
        variables.put("eventName",execution.getEventName());
        variables.put("currUserId", SecurityUtils.getCurrentUserId());
        variables.put("userId", SecurityUtils.getCurrentUserId());
        //((RmiServerService)rmiProxyFactoryBean.getObject()).submitCallBack(variables,beanName.toString());
    }

    public Expression getFiledName() {
        return filedName;
    }

    public void setFiledName(Expression filedName) {
        this.filedName = filedName;
    }
}
