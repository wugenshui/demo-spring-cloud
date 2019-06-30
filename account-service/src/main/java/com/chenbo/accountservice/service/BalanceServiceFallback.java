package com.chenbo.accountservice.service;

import com.chenbo.accountservice.model.Balance;
import org.springframework.stereotype.Component;

@Component
public class BalanceServiceFallback implements BalanceService {
    @Override
    public Balance getBalance(Integer id) {
        return new Balance(0, 0, 0, "降级");
    }
}
