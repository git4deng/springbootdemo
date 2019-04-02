package com.david.springboot.config;

import com.david.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration:指明当前类是一个配置类，就是替代之前spring配置文件
 * 以前spring的xml配置文件中使用<bean></bean>标签添加组件
 * @author david
 * @create 2019-03-31 15:54
 */
@Configuration
public class Myconfig {
    /**
     * @Bean 将方法的返回值添加到容器中，容器中这个组件默认id就是方法名
     * @return
     */
    @Bean
    public HelloService helloService(){
        System.out.println("将组件加入容器。。。。");
        return new HelloService();
    }
}
