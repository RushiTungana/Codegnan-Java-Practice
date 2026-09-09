package com.oop.read_write.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		File f = new File("./Write.txt");
		f.createNewFile();
		FileWriter write = new FileWriter("Write.txt");
		
		write.write("Hello , brother from another mother");
		write.close();
		System.out.println("=====Succesfully data writen====");
		
		// TODO Auto-generated method stub

	}

}
