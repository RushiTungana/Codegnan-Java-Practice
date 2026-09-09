package com.oop.palindrome;
import java.util.*;
public class ReverseString1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String str = sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("is palindrome");
		}else {
			System.out.println("is not palindrome");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
