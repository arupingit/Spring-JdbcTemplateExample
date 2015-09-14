package com.springDemo.proj.springAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
    	TestBean2 test = (TestBean2)context.getBean("testbean");
    	System.out.println(test.getBean1().getMessg());
    }
}
