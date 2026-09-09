package com.basics;

public class Car {
	String Brand;
	public static void main(String[] args) {
		Car car=new Car();
		car.Brand="BMW";
		System.out.print(car.Brand+" ");
		Car car2=new Car();
		car2.Brand = "Mani";
		System.out.print(car2.Brand);
	}
}

