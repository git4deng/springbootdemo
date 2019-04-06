package com.david.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

/**
 * @author david
 * @create 2019-04-06 11:17
 */
@Controller
public class HelloController {
   @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello web!";
    }
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
       map.put("hello","<h1>hello world!</h1>");
       map.put("users", Arrays.asList("zhangshan","lisi","wangwu"));
        return "success";
    }
}
