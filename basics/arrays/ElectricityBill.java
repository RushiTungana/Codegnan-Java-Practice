package com.basics.arrays;
import java.util.*;
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[12];
		int total=0;
		int v=1;
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the units per month "+v+": ");
			arr[i]=sc.nextInt();
			v++;
			
			total+=arr[i];
			
		}
		double avg=total/12;
		System.out.println("the total units : "+total);
		System.out.println("The average units: "+avg);

	}

}
