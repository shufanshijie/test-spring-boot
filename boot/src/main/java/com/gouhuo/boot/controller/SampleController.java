package com.gouhuo.boot.controller;/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */

import com.gouhuo.boot.pojo.UserProductAuditStatusFail;
import com.gouhuo.boot.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shangj
 * @version com.gouhuo.boot.controller.SampleController, v0.1 2017/7/31 11:07
 */
@Controller
public class SampleController {

    @Autowired
    private SampleService service;

    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/get/{id}")
    public UserProductAuditStatusFail getById(@PathVariable Long id){
        return service.selectById(id);
    }

}
