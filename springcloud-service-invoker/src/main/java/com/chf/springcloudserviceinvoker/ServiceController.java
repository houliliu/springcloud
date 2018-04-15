package com.chf.springcloudserviceinvoker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ${DESCRIPTION}
 *
 * @author 温柔一刀
 * @create 2018-04-15 10:13
 **/
@RestController
public class ServiceController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("hello")
    public String service (){
        System.out.println("-------------------");
        // 根据应用名称调用服务
        String json = restTemplate.getForObject(
                "http://service-provider/hi?name=tom111", String.class);
        return json;
    }

    @RequestMapping("test")
    public String test (){
        return "test";
    }

}
