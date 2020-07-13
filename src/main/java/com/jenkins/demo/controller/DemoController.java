package com.jenkins.demo.controller;

import com.jenkins.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demojenkins
 * @description: 示例前端控制器类
 * @author: Hasee
 * @create: 2020-07-13 16:01
 */
@RestController
@RequestMapping("/")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/hello")
    public String helloWorld(){
        return demoService.sayHello();
    }
}
