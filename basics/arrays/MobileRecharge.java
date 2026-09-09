package com.basics.arrays;
import java.util.*;
public class MobileRecharge {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int recharge, total = 0;
		        while (true) {
		            System.out.print("Enter recharge amount (0 to stop): ");
		            recharge = sc.nextInt();
		            if (recharge == 0) {
		                break;
		            }
		            total += recharge;
		        }
		        System.out.println("Total Revenue = " + total);

		        sc.close();
	}

}
