package com.chenbo.demospringcloudprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : chenbo
 * @date : 2019-12-25
 */
@RestController
public class EchoController {

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable("string") String string) {
        return "Hello Nacos Provider " + string;
    }
}
