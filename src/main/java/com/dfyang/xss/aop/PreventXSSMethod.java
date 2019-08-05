package com.dfyang.xss.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: 55411
 * @Date: 2019/6/21 11:48
 * @Description: 注解在方法上，表示该方法中的参数需要预防XSS
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PreventXSSMethod {

}