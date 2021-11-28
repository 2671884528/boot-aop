package com.gyg.aop.service;

import com.gyg.aop.moudle.Action;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class DemoAnnotationService implements Serializable {
    @Action(name="注解氏拦截add操作")
    public void add(){

    }
}
