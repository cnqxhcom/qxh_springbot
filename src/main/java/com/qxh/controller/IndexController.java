package com.qxh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController.java
 * @Description TODO
 * @Author cnqxh
 * @Date 2020-03-22 17:53:18
 * @Version 1.0
 * @Copyright cnqxh 版权所有
 */
@RestController
public class IndexController {
    private String message = "我是一名出色的残品研发工程师";

    @RequestMapping("/index")
    public String index() {
        return message;
    }
}
