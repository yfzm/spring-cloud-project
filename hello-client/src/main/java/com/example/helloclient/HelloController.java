package com.example.helloclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod = "HelloError")
    public String sayHello() {
        return "Hello from " + port;
    }

    public String HelloError() {
        return "Sorry! Error occurred at port " +port;
    }

}
