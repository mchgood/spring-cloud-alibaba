package com.funtl.hello.spring.cloud.alibaba.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient//服务消费者
@EnableFeignClients//开启feign
public class NacosConsumerApplication {

    public static void main(String [] args){
        SpringApplication.run(NacosConsumerApplication.class,args);
    }
}
