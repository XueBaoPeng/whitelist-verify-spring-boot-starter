package com.xbp.start.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于AOP切面
 * key；获取入参类属性中某个值
 * returnJson；拦截返回Json内容
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface WhiteList {

    String key() default "";

    String returnJson() default "";

}
