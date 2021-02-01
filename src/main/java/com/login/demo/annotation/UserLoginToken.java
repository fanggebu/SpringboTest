package com.login.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: Test
 * @Package: com.login.demo.annotation
 * @ClassName: UserLoginToken
 * @Author: qiuhen
 * @Description: 用于登录后才能操作的token
 * @Date: 2021/1/31 19:40
 * @Version: 1.0
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserLoginToken {
    boolean required() default true;
}

/*RetentionPolicy.RUNTIME:这种类型的Annotations将被JVM保留,
所以他们能在运行时被JVM或其他使用反射机制的代码所读取和使用。*/
