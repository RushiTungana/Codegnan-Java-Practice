package com.oop.palindrome;
import java.util.*;

public class DuplicatesString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String str = sc.nextLine();
		String result="";
		char ch=' ';
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(result.indexOf(ch)==-1) {
				result+=ch;
			}
		}
		System.out.println(result);

	}

}
