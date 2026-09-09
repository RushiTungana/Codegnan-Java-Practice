package com.oop.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandling_1 {

	public static void main(String[] args)throws IOException {
		Path path = Paths.get(System.getProperty("user.home"), "TestFile.txt");
		// TODO Auto-generated method stub
		Files.createFile(path);
		System.out.println("Absolute path: "+path.toAbsolutePath());
		System.out.println("Exists: "+Files.exists(path));
		System.out.println("Is writable: "+Files.isWritable(path));
		
		File f = new File("./result.txt");
		System.out.println(f.createNewFile());
		System.out.println(f.exists());
		

	}

}
