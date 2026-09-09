package com.oop.palindrome;
import java.util.*;
public class DuplicatesString1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String str = sc.nextLine();
		String rev="";
		char ch = ' ';
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
		
		if(rev.indexOf(ch)==-1) {
			rev+=ch;
		}
		}
		System.out.println(rev);
		sc.close();
		// TODO Auto-generated method stub

	}

}
