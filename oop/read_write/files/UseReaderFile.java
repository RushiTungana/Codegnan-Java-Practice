package com.oop.read_write.files;

import java.io.FileReader;
import java.io.IOException;

public class UseReaderFile {

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("Write.txt");
		int data;
		while((data=fileReader.read())!=-1) {
			char ch = (char)data;
			if(ch==' ')System.out.println();
			System.out.print((char)data);
		}
		fileReader.close();

	}

}
