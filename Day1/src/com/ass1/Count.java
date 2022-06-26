package com.ass1;

public class Count implements Runnable{

	int count=0;

	@Override
	public void run() {
		System.out.println("Calculating the Count");
		for(int i=1;i<=10;i++) {
			count+=i;
		}
		System.out.println("Count is calculated");
	}
	
	public static void main(String[] args) {
		
		Count c = new Count();
		Thread t = new Thread(c);
		
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count is "+c.count);
	}
}
