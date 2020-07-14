package com.cn.nacossentinel.FeignService.Impl;

import com.cn.nacossentinel.FeignService.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceImpl implements FeignService {

    @Override
    public String hello() {
        return "feign-sentinel-error!";
    }
}
