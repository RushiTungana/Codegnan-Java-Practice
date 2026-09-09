package com.basics.arrays;
import java.util.*;

public class FiveStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of members: ");
		int n=sc.nextInt();
		int rating=0;
		int sum=0;
		int v=1;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the review stars "+v+"(1-5): ");
			int x=sc.nextInt();
			sum+=x;
			if(x==5) {
				rating++;
			}
		}
		double avg=sum/n;
		System.out.println("The Average Rating: "+ avg);
		System.out.println("The number of 5 star rating: "+rating);

	}

}
