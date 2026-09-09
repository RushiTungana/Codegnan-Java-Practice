package com.oop.read_write.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferWrite {

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferWriter=new BufferedWriter(new FileWriter("Write.txt", true)); 
		
		bufferWriter.write("coming doimg thaming chaming liminhjvkvjnfvjnev");
		bufferWriter.newLine();
		bufferWriter.write("abcdefghijklmnopqurstuvwxyz");
		bufferWriter.newLine();
		bufferWriter.write("End line is the last line");
		bufferWriter.close();
		System.out.println("====Written data is succesfully========");
		
		// TODO Auto-generated method stub

	}

}
