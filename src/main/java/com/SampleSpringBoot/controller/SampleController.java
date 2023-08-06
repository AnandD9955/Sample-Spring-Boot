package com.SampleSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @RequestMapping("/hello")
    public String test(){
        return "hello";
    }

    @GetMapping("/view")
    public String test2(){
        return "Hello 3KT";
    }
}
