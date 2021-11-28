package com.gyg.aop.moudle;

import java.lang.annotation.*;

/**
 * 编写拦截器规则
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
