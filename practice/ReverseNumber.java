package com.practice;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r=0;
		while(n>0) {
			int s=n%10;
			r=r*10+s;
			n/=10;
			
		}
		System.out.println(r);
		

	}

}
