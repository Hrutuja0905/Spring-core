package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.spring.javaconfig")

public class javaconfig {
	
	@Bean
	public Persong getName() {
		
		Persong persong = new Persong();
		
		return persong;
		
	}

}
