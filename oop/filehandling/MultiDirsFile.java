package com.oop.filehandling;

import java.io.File;
import java.io.IOException;

public class MultiDirsFile {

	public static void main(String[] args) throws IOException {
		File dir=new File("./testdir");
		boolean isCreated=dir.mkdirs();
		System.out.println("Directory testdir exists: "+isCreated);
		File file = new File(dir,"my_data2.txt");
		boolean fileCreated=file.createNewFile();
		System.out.println("Is File exists: "+fileCreated);
	}

}
