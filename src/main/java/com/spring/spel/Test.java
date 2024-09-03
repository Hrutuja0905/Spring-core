package com.spring.spel;

import org.springframework.expression.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/spel/config1.xml");
		
		Student stud = context.getBean("student",Student.class);
		
		System.out.println(stud);
				
		
		

	}

}