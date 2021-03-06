package com.cn.nacossentinel.fallback;

import com.cn.nacossentinel.FeignService.FeignService;
import org.springframework.stereotype.Component;


@Component
public class EchoServiceFallback implements FeignService {

    /*private Throwable throwable;

    EchoServiceFallback(Throwable throwable){
        this.throwable = throwable;
    }*/

    @Override
    public String hello() {
        return "feign-sentinel-error!";
    }
}
