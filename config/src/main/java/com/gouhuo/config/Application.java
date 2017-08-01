/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.gouhuo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shangj
 * @version Application, v0.1 2017/8/1 10:11
 */
@Configuration
@EnableAutoConfiguration
@RestController
@EnableConfigServer
public class Application {

    @Value("${config.name}")
    String name;

    @RequestMapping("/")
    public String home() {
        return "Hello " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
