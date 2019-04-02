package com.david.springboot;

import com.david.springboot.beans.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * spring boot的单元测试
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ConfigApplicationTests {
	@Autowired
	Person person;
	@Autowired
	ApplicationContext ioc;
	@Test
	public void testImportResource(){
		boolean helloService = ioc.containsBean("helloService");
		System.out.println("是否包含helloService这个bean?"+helloService);
	}
	@Test
	public void contextLoads() {
		System.out.println(person);
	}

}
