package com.david.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个springboot应用
 * @author david
 * @create 2019-03-28 23:26
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args );
    }
}
