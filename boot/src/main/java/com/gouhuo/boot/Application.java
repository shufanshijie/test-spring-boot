/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.gouhuo.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author shangj
 * @version Application, v0.1 2017/7/31 11:35
 */
@EnableAutoConfiguration
@ServletComponentScan
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
