package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 伍六七
 * @date 2023/8/4 19:20
 */
@RestController
@RequestMapping("/")
public class DemoController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
