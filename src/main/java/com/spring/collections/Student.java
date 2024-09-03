package com.spring.collections;


import java.util.List;

public class Student {
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	private String name;
	private List<String> phone;
	
	
}
