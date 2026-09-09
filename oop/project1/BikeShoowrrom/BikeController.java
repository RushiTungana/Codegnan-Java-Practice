package com.oop.project1.BikeShoowrrom;

public class BikeController {
	static BikeRepository bikeRepo;

	public static void main(String[] args) {
		BikeEntity b1=new BikeEntity();
		b1.setName("Hero Splendor");
		b1.setModel("Splender");
		b1.setMileage(70);
		
		
		BikeEntity b2 = new BikeEntity();
		b2.setName("Honda Shine");
		b2.setModel("Shine 125");
		b2.setMileage(30);
		
		
		BikeEntity b3 = new BikeEntity();
		b3.setName("Bmw");
		b3.setModel("1000RR");
		b3.setMileage(12);
	
		
		
		bikeRepo =new BikeRepository();
		bikeRepo.saveBike(b1);
		bikeRepo.saveBike(b2);
		bikeRepo.saveBike(b3);
		

	}

}
