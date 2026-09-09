package com.practice;
import java.util.*;

public class Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number: ");
		int n = sc.nextInt();
		if(n>=1&&n<=100) {
			System.out.println(n+" range between 1 and 100");
		}else {
			System.out.println(n+" not on the range");
		}
 
	}

}
