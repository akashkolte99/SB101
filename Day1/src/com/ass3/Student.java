package com.ass3;

public class Student extends Thread {

	Common c ;
	String name ;
	
	public Student(Common c, String name) {
		super();
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		c.fun1(name);
	}
	
}
