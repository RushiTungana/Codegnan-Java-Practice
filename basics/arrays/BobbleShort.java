package com.basics.arrays;

import java.util.Arrays;

public class BobbleShort {

	public static void main(String[] args) {
		//Manual sort;
		int[] arr= {6,8,9,4,8,4,2,0};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		//direst sort using Arrays.sort;
		System.out.println();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
//		Sir Problem
		System.out.println();
		bubbleSort(arr);
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

	private static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

}
