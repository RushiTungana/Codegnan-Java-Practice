package com.oop.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingToFile {


	public static void main(String[] args) throws IOException {
		try (
			FileOutputStream write = new FileOutputStream("./testdir/my_data.txt")){
			
			String Message = "Hello brother from another mother";
			write.write(Message.getBytes());
			System.out.println("Data is written to the file");
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		// TODO Auto-generated method stub
		try(resourse){
			
		}catch(Exception e) {
			
		}

	}

}
