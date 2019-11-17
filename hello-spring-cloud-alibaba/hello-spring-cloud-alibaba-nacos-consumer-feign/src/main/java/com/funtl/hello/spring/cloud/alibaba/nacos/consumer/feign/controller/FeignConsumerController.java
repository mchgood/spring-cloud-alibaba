package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试Feign （HTTP 通信协议）调用；
 * 负载均衡（对同一需求的多个服务发送请求）；
 * sentinel 熔断机制的触发。
 */
@RestController
public class FeignConsumerController {

    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/echo/hi")
    public String echo(){
        return echoService.echo("Hi Feign !");
    }

}


