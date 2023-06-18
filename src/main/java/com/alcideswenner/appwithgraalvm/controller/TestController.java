package com.alcideswenner.appwithgraalvm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TestController {

    @GetMapping(value = "/hello")
    public String getHello() {
        return "Hello!";
    }
}
