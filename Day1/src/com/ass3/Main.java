package com.ass3;

public class Main {

	public static void main(String[] args) {
		
		Common c = new Common();
		Student s1 = new Student(c,"Akash");
		Student s2 = new Student(c,"Amit");

		s1.start();
		s2.start();
	}
}
