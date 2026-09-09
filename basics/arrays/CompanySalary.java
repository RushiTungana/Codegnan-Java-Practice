package com.basics.arrays;
import java.util.*;

public class CompanySalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int n=sc.nextInt();
		int[] arr= new int[n];
		int v=1;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Employees salary: "+v+": ");
			arr[i]=sc.nextInt();
			v++;
		}
		int max=arr[0];
		int low=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<low) {
				low=arr[i];
			}
		}
		System.out.println("The hight salary: "+max);
		System.out.println("The lowest salary: "+low);
		

	}

}
