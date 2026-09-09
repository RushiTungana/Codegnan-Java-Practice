package com.practice;
import java.util.*;

public class Division {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		if(a%3==0&&a%4==0) {
			System.out.println("FIZZ BUZZ");
		}else if(a%3==0) {
			System.out.println("FIZZ");
		}else if(a%4==0){
			System.out.println("BUZZ");
		}else {
			System.out.println("NO FIZZ NO BUZZ");
		}

	}

}
