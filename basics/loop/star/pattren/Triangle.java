package com.basics.loop.star.pattren;
import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int star=-1;
		int space=n;
		for(int i=1;i<=2*n-1;i++) {
			if(i<=n) {
				star+=2;
				space--;
			}else {
				star-=2;
				space++;
			}
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
				for(int j=1;j<=star;j++) {
					System.out.print("*");
				}
				
				System.out.println();
		}

	}

}
