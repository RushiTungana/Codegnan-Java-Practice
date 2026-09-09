package com.practice;
import java.util.*;
public class Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter: ");
		char a=sc.next().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
			System.out.println(a+" is vowel");
		}else {
			System.out.println(a+ " is a consonant");
		}

	}

}
