package com.basics.ifelse;
import java.util.*;
public class Divisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n%3==0&&n%5==0) {
			System.out.println(n+" divisible by both 3 and 5");
		}else {
			System.out.println(n+" not divisible by both 3 and 5");
		}

	}

}
