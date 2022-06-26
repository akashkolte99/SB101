package com.ass2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("D://input.txt");
		int i=fr.read();
		
		while( i != -1) {
		char x = (char)i;
		
		i = fr.read();
		}

		
		int count =0;
		
		
		
	}
}
