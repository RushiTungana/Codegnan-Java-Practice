package com.basics.arrays;
import java.util.*;
public class CricketMatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number matchs player play: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int total=0;
		int highest=0;
		int v=1;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the scourein match:"+v+": ");
			arr[i]=sc.nextInt();
			v++;
			total+=arr[i];
			
			if(arr[i]>highest) {
				highest=arr[i];
			}
		}
		double avg=total/n;
		System.out.println("The total runs: "+total);
		System.out.println("the highest scours: "+highest);
		System.out.println("The average player is: "+avg);
		
		

	}

}
