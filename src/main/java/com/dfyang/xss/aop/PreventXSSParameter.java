package com.dfyang.xss.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: 55411
 * @Date: 2019/6/21 15:30
 * @Description: 注解在参数上，表示该参数需要预防XSS
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface PreventXSSParameter {

}
