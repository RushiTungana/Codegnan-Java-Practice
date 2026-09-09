package com.basics.arrays;
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ArraySize: ");
		int n =sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the elements: "+i+" ");
			arr[i]=sc.nextInt();
		}
		System.out.println("The array numbers: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
//		System.out.print(arr[i]);
		System.out.print("!Rever Array is: ");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}

	}

}
