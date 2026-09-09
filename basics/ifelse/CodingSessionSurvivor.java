package com.basics.ifelse;

public class CodingSessionSurvivor {

	public static void main(String[] args) {
		int bugCount=25;
		int coffeeLevel=3;
		boolean isFriday=true;
		if(bugCount>20||(coffeeLevel<2&&!isFriday)){
			System.out.println("Panic Mode");
			
		}else {
			System.out.println("Genius");
		}
		

	}

}
