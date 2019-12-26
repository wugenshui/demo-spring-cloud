package com.chenbo.demospringcloudconsumer.controller;

import com.chenbo.demospringcloudconsumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : chenbo
 * @date : 2019-12-26
 */
@RestController
public class FeignController {
    @Autowired
    private EchoService echoService;

    @GetMapping("/feign/echo/{string}")
    public String echo(@PathVariable("string") String string) {
        return echoService.echo(string);
    }
}
