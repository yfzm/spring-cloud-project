package com.example.feignhiclient;

import com.example.feignhiclient.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "hi-client", configuration = FeignConfig.class)
public interface HiClientFeign {
    @GetMapping("/hi")
    String sayHiFromFeignHiClient();
}
