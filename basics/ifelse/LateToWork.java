package com.basics.ifelse;
import java.util.*;

public class LateToWork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ml: ");
		int ml=sc.nextInt();
		String a=sc.nextLine();
		System.out.println("Enter the it is raining: ");
		boolean isRaining=sc.nextBoolean();
		boolean isMonday=sc.nextBoolean();
		if(ml<=5) {
			System.out.println("You are early");
		}else if(ml>6&&ml<15) {
			System.out.println("Traffic? Dog ate your alaram?");
		}else if(ml>16&&ml<30&&isRaining) {
			System.out.println("Valid Excuse!");
			
		}else if(ml>16&&ml<30&&!isRaining) {
			System.out.println("No excuse!");
		}else if(ml>=31) {
			System.out.println("Did you even wakeUP? or are you still sleeping");
			
		}else {
			System.out.println("Negative minutes?");
		}
		

	}

}
