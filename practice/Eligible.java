package com.practice;
import java.util.*;
public class Eligible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the age: ");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println(age+" Eligible to vote");
		}else {
			System.out.println(age+ " Not Eligible to vote");
		}
		
		

	}

}
