package com.basics.arrays;
import java.util.*;

public class OnlineQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of question: ");
		int n=sc.nextInt();
		int c=0;
		int w=0;
		int total=0;
		int v=1;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the corrent and wrong question by student: "+i+"1 for right answer,0 for wrong answer: ");
			int x=sc.nextInt();
			if(x==1) {
				c++;
			}
			if(x==0) {
				w++;
			}
		}
		total+=c;
		System.out.println("Enter the correct answer: "+c);
		System.out.println("Enter the wrong answer: "+w);
		System.out.println("The total scour"+total+"/"+n);
		
		
		

	}

}
