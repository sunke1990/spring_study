package com.aop;


import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;


/**
 * @author sunke
 * @DATE 2021/12/1
 **/
@Component
public class AspectAdvisor extends AbstractPointcutAdvisor implements MethodInterceptor{
    Pointcut point = AnnotationMatchingPointcut.forMethodAnnotation(AspectJ.class);
    @Override
    public Pointcut getPointcut() {
        return point;
    }

    @Override
    public MethodInterceptor getAdvice() {
        AnnotationMatchingPointcut pointcut = AnnotationMatchingPointcut.forMethodAnnotation(AspectJ.class);
        return this;
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        Object[] arguments = invocation.getArguments();
        Parameter[] parameters = method.getParameters();
        AspectJ aspectJ = method.getAnnotation(AspectJ.class);
        String v = aspectJ.value();
        int ownership = 0;
        for (int i = 0; i < parameters.length; i++) {
           if (parameters[i].getName().equals(v)){
               String arg = arguments[i].toString();
               if (arg == null){
                   throw new Exception("参数为空");
               }
               ownership = Integer.parseInt(arg);
           }
        }

        return invocation.proceed();
    }
}
