package com.basic.nonstatic;

import com.basic.staticclass.Showroom;

public class Items {
	private String type;
	private String brand;
	private int price;
	private int model;
	public static void main(String[] args) {
		Items i1=new Items();
		System.out.println(i1);
		i1.type="Car";
		i1.brand="Shift";
		i1.price=550000;
		i1.model=2025;
		System.out.println("Showroom name: "+Showroom.name);
		System.out.println("type: "+i1.type);
		System.out.println("brand: "+i1.brand);
		System.out.println("Price of car: "+i1.price);
		System.out.println("Car model: "+i1.model);
		System.out.println("Address of show room: "+Showroom.Address);
		System.out.println("ShowRoom number: "+Showroom.phone);
		System.out.println();
		
		Items i2=new Items();
		System.out.println(i2);
		i2.type="Bike";
		i2.brand="R 15-V4";
		i2.price=250000;
		i2.model=2026;
		System.out.println("Showroom name: "+Showroom.name);
		System.out.println("type: "+i2.type);
		System.out.println("brand: "+i2.brand);
		System.out.println("Price of car: "+i2.price);
		System.out.println("Car model: "+i2.model);
		System.out.println("Address of show room: "+Showroom.Address);
		System.out.println("ShowRoom number: "+Showroom.phone);
		

	}

}
