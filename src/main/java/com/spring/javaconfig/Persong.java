package com.spring.javaconfig;

import org.springframework.stereotype.Component;

@Component("firstperson")
public class Persong {

	public void go() {
		System.out.println("she is going to school");
	}
}
