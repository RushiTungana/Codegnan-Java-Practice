package com.basics.arrays;
import java.util.*;
public class Hospital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=0;
		for(int i=1;i<=5;i++) {
			System.out.print("enter the temp "+i+": ");
			double temp=sc.nextDouble();
			
			if(temp>100) {
				c++;
			}
		}
		System.out.println("The total Patients with temperature above 100°F: "+c);

	}

}
