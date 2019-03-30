package com.david.springboot.helloworld.quick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author david
 * @create 2019-03-30 21:34
 */
//@ResponseBody //这个注解方在类上表示这个类下的所有方法返回的数据都直接写给浏览器，如果是对象还能转换整json数据
//@Controller
// @RestController的作用就是：Controller+ResponseBody的合体
@RestController
public class HelloController {
    @RequestMapping("/hello")

    public String hello(){
        return "this is a quick springboot's helloworld!";
    }
}
