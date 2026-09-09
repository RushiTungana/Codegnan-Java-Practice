package com.basics.arrays;
import java.util.*;
public class AttendanceCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Strength of class: ");
		int n=sc.nextInt();
		int p=0,a=0;
		for(int i=1;i<=n;i++) {
			System.out.print("Enter the Attendance of student"+i+"present=1,Absent=0: ");
			int attendance=sc.nextInt();
			if(attendance==1) {
				p++;
			}
			if(attendance==0) {
				a++;
			}
		}
		System.out.println("The total number of present"+p);
		System.out.println("The total number of Absent:"+a);
		sc.close();
	}

}
