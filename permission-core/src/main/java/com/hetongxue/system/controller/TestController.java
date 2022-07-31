package com.hetongxue.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 测试模块
 * @ClassNmae: TestController
 * @Author: 何同学
 * @DateTime: 2022-07-31 16:42
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String hello() {
        return "hello word!";
    }

}