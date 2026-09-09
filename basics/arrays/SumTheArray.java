package com.basics.arrays;
import java.util.*;

public class SumTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			if(i%2==0) {
				sum+=x;
			}else {
				sum-=x;
			}
		}
		System.out.println(sum);

	}

}
