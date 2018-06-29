package com.example.feignhiclient.service;

import com.example.feignhiclient.HiClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {

    private final HiClientFeign hiClientFeign;

    @Autowired
    public HiService(HiClientFeign hiClientFeign) {
        this.hiClientFeign = hiClientFeign;
    }

    public String sayHi() {
        return hiClientFeign.sayHiFromFeignHiClient();
    }
}
