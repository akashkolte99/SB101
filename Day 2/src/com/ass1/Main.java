package com.ass1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		
    	BufferedReader	bf = new BufferedReader(new FileReader("D:\\abc.txt"));

    	String line = bf.readLine();
		
    	while(line != null) {
    		System.out.println(line);
    		line = bf.readLine();
    	}
		
	}
}
