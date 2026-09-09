package com.basics.ifelse;
import java.util.*;
public class Division5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		if(n%5==0) {
			System.out.println(n+" is div by 5");
		}else if(n%11==0) {
			System.out.println(n+" is div by 11");
		}else {
			System.out.println("Invalid number");
		}
		

	}

}
