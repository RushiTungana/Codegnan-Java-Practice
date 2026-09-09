package com.basics.ifelse;
import java.util.*;
public class Months {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter: ");
		char letter=sc.next().charAt(0);
		switch(letter){
		case 'j': System.out.println("Jan");
		break;
		case 'f': System.out.println("feb");
		break;
		case 'm': System.out.println("mar");
		break;
		case 'a': System.out.println("apr");
		break;
		
		default : System.out.println("Invalid");
		
		}
		
	
		

	}

}
