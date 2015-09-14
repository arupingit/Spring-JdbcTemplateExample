package com.springDemo.proj.springAop;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public TestBean2 getbeaninject(){
		return new TestBean2();
	}
}
