package com.cn.nacossentinel.FeignService;

import com.cn.nacossentinel.FeignService.Impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-provider",fallback = FeignServiceImpl.class)
public interface FeignService {

    @GetMapping("/p-hello/h")
    String hello();
}
