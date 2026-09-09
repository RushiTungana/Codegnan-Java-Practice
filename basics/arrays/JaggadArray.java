package com.basics.arrays;
import java.util.*;

public class JaggadArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] last=null;
		for(int i=0;i<n;i++) {
			int k=sc.nextInt();
			last=new int[k];
			for(int j=0;j<k;j++) {
				last[j]=sc.nextInt();
			}
		}
		for(int i=0;i<last.length;i++) {
			System.out.print(last[i]+" ");
		}
		
	}

}
