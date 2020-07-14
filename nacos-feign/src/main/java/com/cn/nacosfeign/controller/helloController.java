package com.cn.nacosfeign.controller;

import com.cn.nacosfeign.FeignService.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("f-hello")
public class helloController {

    @Autowired
    FeignService feignService;

    @GetMapping("/h")
    public String hello(){
        return "feign-"+feignService.hello();
    }
}
