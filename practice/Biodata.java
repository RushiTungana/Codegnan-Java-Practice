package com.practice;
import java.util.*;
public class Biodata {
	String name;
	int age;
	String email;
	public static void main(String[] args) {
		Biodata b1=new Biodata();
		b1.name="Shiva Jadaluuuuu";
		b1.age=80;
		b1.email="shiavjadaluuuu@gmail.com";
		System.out.println("Name: "+b1.name);
		System.out.println("age: "+b1.age);
		System.out.println("Email: "+b1.email);
		Mainbasic();

	}
	private static void Mainbasic() {
		//Widening
		int a=45;
		long b=a;
		System.out.println("==============");
		System.out.println(b);
		System.out.println("==============");
		//narrowing
		int c=167;
		byte d=(byte)c;
		System.out.println(d);
		System.out.println("==============");
		String s="Shiva dhandupalam";
		int x=420;
		System.out.println(s+" "+x);
		System.out.println("==============");
		ifelse();
		
		
	}
	private static void ifelse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		//if else()
		int age=sc.nextInt();
		if(age<=16) {
			System.out.println("Not eligible");
		}else if(age>16&&age<60) {
			System.out.println("Your are eligible");
		}else {
			System.out.println("get out");
		}
		System.out.println("==============");
		
		Switchcase();
		
	}
	private static void Switchcase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item number: ");
		//switch()
		int a=sc.nextInt();
		switch(a){
			case 1: System.out.println("Dosa");
			break;
			case 2: System.out.println("Idly");
			break;
			default: System.out.println("Upma");
			break;
			
		}
		System.out.println("==============");
		
	}

}
