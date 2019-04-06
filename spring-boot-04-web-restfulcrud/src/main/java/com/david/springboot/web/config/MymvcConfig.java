package com.david.springboot.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author david
 * @create 2019-04-06 23:07
 */
@Configuration
public class MymvcConfig extends WebMvcConfigurerAdapter {
    /**
     * 登陆页面实现方式二：自己写一个配置类，然后配置一个自己的视图解析器，来处理
     * @return
     */
    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter=new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");

            }
        };
        return adapter;
    }
}
