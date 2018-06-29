package com.example.feignhiclient.hystrix;

import com.example.feignhiclient.HiClientFeign;
import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements HiClientFeign {
    @Override
    public String sayHiFromFeignHiClient() {
        return "Ooooops! Error!";
    }
}
