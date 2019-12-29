package com.chenbo.demospringcloudconsumer.service.fallback;

import com.chenbo.demospringcloudconsumer.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @author : chenbo
 * @date : 2019-12-29
 */
@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String string) {
        return "您的网络有问题！";
    }
}
