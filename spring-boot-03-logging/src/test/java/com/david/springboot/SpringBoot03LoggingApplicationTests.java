package com.david.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot03LoggingApplicationTests {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Test
	public void contextLoads() {
		//日志级别，由低到高 trace<trace<info<warn<error
		//可以通过调整输出日志级别，这样来控制日志的输出

		logger.trace("这是trace日志。。。");
		logger.trace("这是debug日志。。。");
		//spring boot 默认调整的日志级别是 info级别的，可以通过配置文件配置输出日志的级别
		logger.info("这是info日志。。。");
		logger.warn("这是warn日志。。。");
		logger.error("这是错误日志。。");
	}

}
