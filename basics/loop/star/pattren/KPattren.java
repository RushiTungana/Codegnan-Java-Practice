package com.basics.loop.star.pattren;
import java.util.*;

public class KPattren {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt();
		int star=n+1;

		for(int i=1;i<=n;i++) {
			star--;
			for(int j=1;j<=star;j++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
		star=1;
		for(int i=1;i<n;i++) {
			star++;
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
