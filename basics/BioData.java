package com.basics;

public class BioData {

	public static void main(String[] args) {
//		bioData("Mani",21,"mani@gmail.com","srikakulam","Andhra pradesh");
//		bioData("sai",21,"sai@gmail.com","srikakulam","Andhra pradesh");
//		bioData("shiva",21,"shiva@gmail.com","plvd","Andhra pradesh");
//		bioData("hemanth",21,"Hemanth@gmail.com","vizayanagaram","Andhra pradesh");
//		familyMember("chandhra sekhara rao",44,"sekhara@gamil.com","Srikakulam","Andhra pradesh");
//		familyMember("Chinnari",36,"chinnari@gmail.com","Srikakulam","Andhra pradesh");
		
		mobileFeature("iphone 15",48,3349,79999,"i like this phone because of camera quility is");
		
	}

	private static void mobileFeature(String name, int camera, int battery, int price, String plot) {
		System.out.println(name+" "+plot+" "+camera+" and battery is "+battery+" and the priceing is "+price+".");
		
		
	}

	private static void familyMember(String name, int age, String email, String city, String state) {
		System.out.println("FamilyMember biodata");
		System.out.println(name+", "+age+", "+email+", "+city+", "+state+".");
		System.out.println("===*=== ");
		
		
	}

	private static void bioData(String name, int age, String email, String city, String state) {
		System.out.println("biodata");
		System.out.println(name+", "+age+", "+email+", "+city+", "+state+".");
		System.out.println("===*=== ");
		
		
		
		
	}

}
