package com.dfyang.xss.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: 55411
 * @Date: 2019/6/21 16:20
 * @Description: 注解在字段上，表示该字段需要预防XSS
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PreventXSSField {

}