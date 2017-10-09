package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jacky on 2017-07-31.
 */
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World!";
    }
    
    @RequestMapping("/hi")
    public String index_1() {
        return "Hello World!";
    }

}
