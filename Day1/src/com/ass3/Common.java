package com.ass3;

public class Common {

	public void fun1(String name) {
	
		synchronized (Common.class) {
			System.out.println("Indside Fun1 method with name " + name);
			for(int i=0;i<10;i++) {
				System.out.println("Student Name is :" +name);
			}
		}
		
	}
}


//Write the fun1() method of Common class using synchronised block to get the Class level lock. (You problem from notes)