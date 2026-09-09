package com.basics.arrays;
import java.util.*;
public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			System.out.print("Enter the value: "+ i+" = ");
			arr[i]=sc.nextInt();	
		}
		for(int i=0;i<n;i++) {
		sum+=arr[i];
		System.out.print(arr[i]+" ");
		}
		System.out.println("The sum of array: "+sum);	
//		System.out.println(arr[2]);
		sc.close();

	}

}
