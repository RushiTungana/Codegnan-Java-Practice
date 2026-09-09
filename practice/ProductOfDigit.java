package com.practice;
import java.util.*;
public class ProductOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r=1;
		while(n>0) {
			int p=n%10;
			r*=p;
			n/=10;
		}
		System.out.println(r);

	}

}
