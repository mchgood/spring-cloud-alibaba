package com.funtl.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope//监控配置刷新
@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private String port;

    @Value("${user.name}")
    private String username;


    @GetMapping(value="/echo/{message}")
    public String echo(@PathVariable(value = "message") String message){
        return "Hello Nacos " + message + "I am from " + port;
    }

    @GetMapping(value="/echo")
    public String echo(){
        return "Hello Nacos " + username + "I am from " + port;
    }
}
