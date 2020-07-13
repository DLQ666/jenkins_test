package com.jenkins.demo.service.impl;

import com.jenkins.demo.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @program: demojenkins
 * @description: 示例实现类
 * @author: Hasee
 * @create: 2020-07-13 16:00
 */
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello() {
        return "Hello World";
    }
}
