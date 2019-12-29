package com.chenbo.demospringcloudconsumer.service;

import com.chenbo.demospringcloudconsumer.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author : chenbo
 * @date : 2019-12-26
 */
@FeignClient(value = "service-provider",fallback = EchoServiceFallback.class)
public interface EchoService {
    @GetMapping("/echo/{string}")
    public String echo(@PathVariable("string") String string);
}
