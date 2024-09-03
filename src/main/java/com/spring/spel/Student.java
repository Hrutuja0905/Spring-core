package com.spring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("#{22+56}")
	private int x;
	
	@Value("#{4+6}")
	private int y;
	
	@Value("#{ T(java.lang.Math). sqrt(25) }")
	private double z;
	
	@Value("# {new java.lang.String(' Hrutuja ') } ")
	private String name;
	
	@Value("#{ 8>3 }")
	private boolean isActive;
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", isActive=" + isActive + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
