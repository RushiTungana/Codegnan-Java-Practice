package com.oop.project1.BikeShoowrrom;

public class BikeEntity {
	private String name;
	private String model;
	private int mileage;
	private static int wheel=2;
	public BikeEntity() {
		
	}
	public BikeEntity(String name, String model, int mileage) {
		super();
		this.name = name;
		this.model = model;
		this.mileage = mileage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public static int getWheel() {
		return wheel;
	}
	public static void setWheel(int wheel) {
		BikeEntity.wheel = wheel;
	}
	public void Bikedetails() {
		System.out.println("Name: "+this.name);
		System.out.println("Model: "+this.model);
		System.out.println("Mileage: "+this.mileage);
		System.out.println("Bike Wheels: "+this.wheel);
		System.out.println("===========");
	}

}
