package com.davaid.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author david
 * @create 2019-04-04 23:09
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello config!!";
    }
}
