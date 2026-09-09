package com.basics;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		ifBlockExample();	
		System.out.println("========");
		ifElseExample();
		System.out.println("=========");
		scannerConditional();

	}
	private static void scannerConditional() {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>18&&age<33) {
			System.out.println(age+" Enjoy");
		}else {
			System.out.println(age+" Sorry");
		}
		
	}
	private static void ifElseExample() {
		int age=21 ;
		if(age>=21&&age<=33) {
			System.out.println("Eligible");
		}else {
			System.out.println("Not eligible");
		}
		
	}
	private static void ifBlockExample() {
		int money = 201;
		if(money>=200) {
			System.out.println("Enjoy the show");
		}
		
	}

}
