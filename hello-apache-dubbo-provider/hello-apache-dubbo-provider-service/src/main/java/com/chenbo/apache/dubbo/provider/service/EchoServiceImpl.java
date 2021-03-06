package com.chenbo.apache.dubbo.provider.service;

import com.chenbo.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author : chenbo
 * @date : 2020-01-01
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {
    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String echo(String string) {
        return "Echo Hello Dubbo " + string + " i am from port: " + port;
    }
}