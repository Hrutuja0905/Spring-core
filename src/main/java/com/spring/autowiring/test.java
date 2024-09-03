package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowiring/autoconfig.xml");
	    Employee emp1 = context.getBean("emp1",Employee.class);
	    System.out.println(emp1);
	}

}
