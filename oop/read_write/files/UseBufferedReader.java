package com.oop.read_write.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UseBufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new FileReader("Write.txt"));
		String line;
		while((line = reader.readLine())!=null) {
			System.out.println(line);
		}
		reader.close();
		
		// TODO Auto-generated method stub

	}

}
