package com.oop.palindrome;
import java.util.*;
public class OccurenceChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matter: ");
		String result=sc.nextLine();
		String rev="";
		char ch=' ';
		for(int i=0;i<result.length();i++) {
			ch=result.charAt(i);
			if(rev.indexOf(ch)==-1) {
				int count=0;
				
				for(int j=0;j<result.length();j++) {
					if(result.charAt(j)==ch) {
						count++;	
					}
				}
				System.out.println(ch+":"+ count);
				rev+=ch;
			}
		}
		// TODO Auto-generated method stub

	}

}
