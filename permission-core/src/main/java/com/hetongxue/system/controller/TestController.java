package com.hetongxue.system.controller;

import com.hetongxue.aop.log.Logging;
import com.hetongxue.common.response.Result;
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
    @Logging(module = "测试模块", operate = "测试链接")
    public Result hello() {
        return Result.Success("hello word!");
    }

}