package com.cn.nacosconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nc-hello")
public class HelloController {

    @Autowired
    ConfigurableApplicationContext applicationContext;

    @Value("${user.name}")
    public String username;

    @GetMapping("/h")
    public String hello(){
        return "hello " + username;
    }

    @GetMapping("/hey")
    public String hey(){
        return "hey "+ applicationContext.getEnvironment().getProperty("user.name");
    }
}
