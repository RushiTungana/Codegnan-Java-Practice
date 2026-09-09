package com.basics.ifelse;
import java.util.*;
public class SwitchExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item: ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1: System.out.println("Dosa");
		break;
		case 2: System.out.println("Idli");
		break;
		case 3: System.out.println("vada");
		break;
		case 4: System.out.println("puri");
		break;
		default: System.out.println("biyataku pooo");
		}

	}

}
