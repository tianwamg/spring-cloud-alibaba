package com.nacos.nacosprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/p-hello")
public class helloController {

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping("/h")
    public String hello(){
        return "hell0: "+applicationContext.getEnvironment().getProperty("user.name");
    }
}
