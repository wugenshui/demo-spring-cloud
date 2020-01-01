package com.chenbo.apache.dubbo.provider.service;

import com.chenbo.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author : chenbo
 * @date : 2020-01-01
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String string) {
        return "Echo Hello Dubbo " + string;
    }
}