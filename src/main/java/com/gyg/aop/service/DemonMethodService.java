package com.gyg.aop.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class DemonMethodService extends CommService {

    @Override
    public void add() {

    }

    public void desc(){
        System.out.println();
    }
}
