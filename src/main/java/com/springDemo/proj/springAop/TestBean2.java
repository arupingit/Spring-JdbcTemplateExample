package com.springDemo.proj.springAop;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean2 {
	
	@Autowired
	private TestBeanInject bean1;

	

	private void setBean1(TestBeanInject bean1) {
		this.bean1 = bean1;
	}



	public TestBeanInject getBean1() {
		// TODO Auto-generated method stub
		return bean1;
	}
	
}
