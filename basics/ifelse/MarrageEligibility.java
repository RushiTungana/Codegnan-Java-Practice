package com.basics.ifelse;
import java.util.*;
public class MarrageEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		if(age<=21) 
			System.out.println(age+" Have some Patience");
		else if(age>=22&&age<=35)
			System.out.println(age+" Eligible for marrage");
		else 
			System.out.println(age+" You have lot of patience");

	}

}
