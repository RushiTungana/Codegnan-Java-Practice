package com.basics.arrays;
import java.util.*;
public class ShoppingSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Purchases product: ");
		int n=sc.nextInt();
		int total=0;
		for(int i=1;i<n;i++) {
			System.out.println("Enter the product of each item:"+i+": ");
			int a=sc.nextInt();
			total+=a;
		}
		System.out.println("The totoal Bill: "+total);

	}

}
