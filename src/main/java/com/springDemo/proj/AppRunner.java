package com.springDemo.proj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springDemo.proj.dao.EmployeeDAO;
import com.springDemo.proj.model.Employee;

/**
 * The Class AppRunner.
 */
public class AppRunner 
{
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
    	EmployeeDAO empDao = (EmployeeDAO)context.getBean("empDao");
    	Employee emp = new Employee();
    	emp.setEmpName("test");
    	emp.setEmpId(0);
    	empDao.deleteById(emp);;
    	System.out.println(empDao.getAll());
    	
    }
}
