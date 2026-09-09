package com.practice;
import java.util.*;
public class Greater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n>=10) {
			System.out.println(n+ " greater than 10");
		}else {
			System.out.println(n+" less than 10");
		}

	}

}
