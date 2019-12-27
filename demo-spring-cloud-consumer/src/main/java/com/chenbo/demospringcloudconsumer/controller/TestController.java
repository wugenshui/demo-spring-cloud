package com.chenbo.demospringcloudconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : chenbo
 * @date : 2019-12-25
 */
@RestController
@RefreshScope
public class TestController {
    @Value("${name}")
    private String name;

    private final RestTemplate restTemplate;

    @Autowired
    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable("string") String string) {
        return restTemplate.getForObject("http://service-provider/echo/" + name + string, String.class);
    }
}
