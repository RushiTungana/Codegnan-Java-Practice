package com.basics.arrays;
import java.util.*;
public class ATMSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Days: ");
		int sum=0;
		int n=sc.nextInt();
		int[] num=new int[n];
		int v=1;
		for(int i=0;i<n;i++) {
			System.out.print("Enter the amount Day"+v+": ");
			num[i] = sc.nextInt();
			v++;
		}
		for(int i=0;i<n;i++) {
			sum+=num[i];
			System.out.print(num[i]+" ");
			
		}
		System.out.println("the total amount: "+sum);
		
		

	}

}
