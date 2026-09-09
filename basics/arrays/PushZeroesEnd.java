package com.basics.arrays;

public class PushZeroesEnd {

	public static void main(String[] args) {
		int[] arr= {1,3,0,5,3,0,5,0,7,6};
		int non=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[non]=arr[i];
				non++;
			}	
		}
		for(int i=non;i<arr.length;i++) {
			arr[i]=0;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
