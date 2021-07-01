package com.kang.eureka.client.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weikang.di
 * @date 2021/6/30 16:55
 */
@RestController
public class UserController {

    @GetMapping("/getUserById")
    public String getUserById(@RequestParam("id") Integer id) {
        return "测试成功,id=" + id;
    }
}
