package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/test2")
    public String tests() {
        return "test2";
    }

    @GetMapping("/test3")
    public String test3() {
        return "test3";
    }
}
