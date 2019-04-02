package com.david.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 *  @ImportResource：导入Spring的配置文件，让配置文件里面的内容生效；
 *  springboot不推荐这种方式引入spring的配置，springboot推荐配置类。加注解的方式
 *
 */
//@ImportResource(locations = {"classpath:person.xml"})
@SpringBootApplication
public class Springboot02ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot02ConfigApplication.class, args);
	}

}
