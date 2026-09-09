package com.basics.ifelse;
import java.util.*;

public class DatingProfile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		System.out.println("enter the you have job or not: ");
		boolean hasJob=sc.nextBoolean();
		System.out.println("You like pineappon pizza: ");
		boolean LikePineappOnPizza=sc.nextBoolean();
		if(age>25&&age<35&&hasJob&&LikePineappOnPizza) {
			System.out.println("Match! Soulmate found!");
		}else if(age>25&&age<35&&hasJob&&!LikePineappOnPizza) {
			System.out.println("Meh.. we can work on ot.maybe.");
			
		}else if(age>25&&age<35&&!hasJob&&!LikePineappOnPizza) {
			System.out.println("Absolutely not.Bye!");
			
		}else if(age>35&&hasJob&&LikePineappOnPizza) {
			System.out.println("You're too old/young.");
		}else {
			System.out.println("Are you even human?");
		}

	}

}
