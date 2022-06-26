package com.ass2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\abc.txt");
		
		FileReader fr = new FileReader(f);
		
		char[] chr =  new char[(int) f.length()];
		
		fr.read(chr);
		
		for(char c : chr) {
			System.out.print(c);
		}
		
	}
}
