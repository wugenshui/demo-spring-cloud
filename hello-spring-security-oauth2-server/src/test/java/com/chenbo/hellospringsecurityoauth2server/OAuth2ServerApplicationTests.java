package com.chenbo.hellospringsecurityoauth2server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : chenbo
 * @date : 2020-01-03
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OAuth2ServerApplicationTests {
    @Test
    public void testBCryptPasswordEncoder() {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
