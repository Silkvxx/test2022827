package com.bjpowernode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    //name属性
    private String name;
    //age
    private Integer age;

    //地址属性
    private String address;


    @GetMapping
    public String test(){
        return "hello git";
    }

    @GetMapping("test01")
    public String test01(){
        return "test";
    }


}
