package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author sunke
 * @DATE 2021/12/1
 **/
@Component
@Aspect
public class AspectP {

    @Pointcut("execution(* com.test..Test.fuc(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void bef(){
        System.out.println("<----------before--------->");
    }

    @After("pointCut()")
    public void af(){
        System.out.println("<----------after--------->");
    }
}
