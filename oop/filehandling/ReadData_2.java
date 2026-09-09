package com.oop.filehandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadData_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./result.txt");
		int data;
		while((data=fis.read())!=-1) {
			System.out.print((char)data);
		}

	}

}
