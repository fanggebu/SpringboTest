package com.login.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: Test
 * @Package: com.login.demo.annotation
 * @ClassName: PassToken
 * @Author: qiuhen
 * @Description: 用来跳过验证的PassToken
 * @Date: 2021/1/31 19:39
 * @Version: 1.0
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PassToken {
    boolean required() default true;
}
