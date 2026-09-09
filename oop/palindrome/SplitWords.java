package com.oop.palindrome;
import java.util.*;
public class SplitWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words: ");
		String str = sc.nextLine();
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			String rev=" ";
			for(int j=words[i].length()-1;j>=0;j--) {
				rev=rev+words[i].charAt(j);
				
			}
			words[i]=rev;
		}
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]+" ");
		}
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
