package com.basics.arrays;

public class LargestNum {
	
	public static void main(String[] args) {
		
		int[] arr= {3,54,2,143,5,148,148,6};
		
		int max=arr[0];
		int max2=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max2=max;
				max = arr[i];	
				
			}	else if(arr[i]>max2&&arr[i]!=max) {
				max2=arr[i];
			}
			
		}
		
		System.out.println("Largest: "+max);
		System.out.println("Secound Leargest: "+max2);
		
	}
}
