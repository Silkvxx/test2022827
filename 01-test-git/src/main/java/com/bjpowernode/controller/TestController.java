package com.bjpowernode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private String name;

    @GetMapping
    public String test(){
        return "hello git";
    }

    @GetMapping("test01")
    public String test01(){
        return "test";
    }


}
