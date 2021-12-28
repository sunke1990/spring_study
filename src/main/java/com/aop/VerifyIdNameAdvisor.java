package com.aop;

import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.*;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author sunke
 * @DATE 2021/12/2
 **/
@Component
public class VerifyIdNameAdvisor extends AbstractPointcutAdvisor {
    Pointcut point = AnnotationMatchingPointcut.forMethodAnnotation(VerifyIdName.class);
    @Override
    public Pointcut getPointcut() {
        return point;
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }

    @Override
    public MethodInterceptor getAdvice() {
       return (invacation) -> {
           Object o = invacation.proceed();
           Method method = invacation.getMethod();
           return invacation.proceed();
       };
    }
}
