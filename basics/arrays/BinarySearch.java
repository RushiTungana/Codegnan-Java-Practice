package com.basics.arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {12,17,19,22,28,29,33};
		int target=22;
		int ansInd=BinarySearch(arr, target);
		System.out.print("The target "+target+" is a Index:  "+ansInd);
	}

	private static int BinarySearch(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				start=mid+1;
			}else{
				end=mid-1;
			}
		}
		return -1;
	}

}
