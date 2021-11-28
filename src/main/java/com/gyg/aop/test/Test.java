package com.gyg.aop.test;

import com.gyg.aop.moudle.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class Test {
//    @Pointcut("@annotation(com.gyg.aop.moudle.Action)")
//    public void annotationPointCut(){
//        System.out.println("@@@");
//    };
//    @After("annotationPointCut()")
//    public void after(JoinPoint joinPoint){
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        Method method = methodSignature.getMethod();
//        Action action = method.getAnnotation(Action.class);
//        System.out.println("注解氏拦截"+action.name());
//    }
//
    @Before("execution(* com.gyg.aop.service.DemonMethodService.*(..))")
    public void before(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法拦截: "+method.getName());
    }
}
