package com.ceying.common.aop;

import com.ceying.common.exception.ServiceException;
import com.ceying.common.util.response.BaseReturnResult;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 功能说明:  feign 值拦截 如果是 BaseReturnResult 则判断 success 字段是否是true 否则抛出异常<br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/7/5<br>
 * <br>
 */
@Aspect //AOP 切面
@Component
public class FeignAop {

    @Pointcut("execution(* com.ceying.*.feign.*+.*(..))")
    public void feign(){}
    /**
     *
     * feign 调用后 判断是否调用成功  调用失败抛异常
     * @param joinPoint
     * @return
     */
    @AfterReturning(value ="feign()",returning = "result")
    public void afterReturnFeign(JoinPoint joinPoint, Object result) throws ServiceException {
        if(result instanceof BaseReturnResult){
            BaseReturnResult bas= (BaseReturnResult) result;
            if(!bas.isSuccess()){
                throw new ServiceException(bas.getCode());
            }
        }
    }
}
