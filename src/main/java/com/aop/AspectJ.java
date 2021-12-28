package com.aop;

import java.lang.annotation.*;

/**
 * @author sunke
 * @DATE 2021/12/1
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface AspectJ {
    String value() default "realName";
}
