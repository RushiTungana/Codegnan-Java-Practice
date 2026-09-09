package com.practice;
import java.util.*;
public class CountNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int count=0;
		int n = sc.nextInt();
		while(n!=0) {
			count++;
			n/=10;
		}
		System.out.println(count);

	}

}
