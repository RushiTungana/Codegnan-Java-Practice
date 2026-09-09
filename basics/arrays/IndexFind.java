package com.basics.arrays;

public class IndexFind {
	public static void main(String[] args) {
		int[] arr= {1,4,9,5,10,2};
		int key=10;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println(i);
			}
			
		}
	}
}
