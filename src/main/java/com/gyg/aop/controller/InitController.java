package com.gyg.aop.controller;

import com.gyg.aop.service.DemoAnnotationService;
import com.gyg.aop.service.DemonMethodService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by gyg
 * @date 2021/11/28 14:42
 * @description
 */
@RestController
@RequestMapping("/")
public class InitController {

    private final DemoAnnotationService demoAnnotationService;
    private final DemonMethodService demonMethodService;

    public InitController(DemoAnnotationService demoAnnotationService, DemonMethodService demonMethodService) {
        this.demoAnnotationService = demoAnnotationService;
        this.demonMethodService = demonMethodService;
    }

    @GetMapping("/1")
    void get(){
        demoAnnotationService.add();
    }
    @GetMapping("/2")
    void get2(){
        demonMethodService.add();
    }
}
