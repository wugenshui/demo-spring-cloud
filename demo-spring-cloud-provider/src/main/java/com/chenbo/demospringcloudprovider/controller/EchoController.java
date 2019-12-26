package com.chenbo.demospringcloudprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : chenbo
 * @date : 2019-12-25
 */
@RestController
public class EchoController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable("string") String string) {
        return port + "：Hello Nacos Provider " + string;
    }
}
