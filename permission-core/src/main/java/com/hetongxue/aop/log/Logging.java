package com.hetongxue.aop.log;

import java.lang.annotation.*;

/**
 * @Description: 自定义日志记录注解
 * @AnnotationNmae: Logging
 * @Author: 何同学
 * @DateTime: 2022-07-31 18:04
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Logging {

    String module() default "";

    String operate() default "";

}