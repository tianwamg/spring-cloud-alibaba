package com.cn.sentineldashboard.fallback;


import com.cn.sentineldashboard.FeignService.FeignService;

public class EchoServiceFallback implements FeignService {

    private Throwable throwable;

    EchoServiceFallback(Throwable throwable){
        this.throwable = throwable;
    }

    @Override
    public String hello() {
        return "feign-sentinel-error!";
    }
}
