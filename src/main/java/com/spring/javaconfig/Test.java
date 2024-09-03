package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);		
		Student student=context.getBean("firststudent",Student.class);
		
		System.out.println(student);
		student.study();
		
		Persong persong = context.getBean("getName",Persong.class);
		
		System.out.println(persong);
		persong.go();
	}
}
