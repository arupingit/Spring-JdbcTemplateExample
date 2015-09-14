package com.springDemo.proj.springAop;

import org.springframework.stereotype.Component;

@Component
public class TestBeanInject {

	private String messg = "Hello Spring";

	public String getMessg() {
		return messg;
	}

	public void setMessg(String messg) {
		this.messg = messg;
	}
	
	
}
