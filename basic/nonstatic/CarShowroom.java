package com.basic.nonstatic;

class Car {
	private String showroomName;
	private String model;
	private double mileage;
	private String brand;
	private double price;
	private String fuelType;
	private boolean available;

    public Car() {
    	System.out.println(this);
        System.out.println("Enter the showroom name: ");
        System.out.println("Enter the model: ");
        System.out.println("Enter the mileage: ");
        System.out.println("Enter the brand: ");
        System.out.println("Enter the price: ");
        System.out.println("Enter the fuel type: ");
        System.out.println("Enter whether the car is available: ");
    }

    public Car(String showroomName, String model, double mileage, String brand,
               double price, String fuelType, boolean available) {
        this.showroomName = showroomName;
        this.model = model;
        this.mileage = mileage;
        this.brand = brand;
        this.price = price;
        this.fuelType = fuelType;
        this.available = available;
    }

    public String getShowroomName() {
        return showroomName;
    }

    public void setShowroomName(String showroomName) {
        this.showroomName = showroomName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void carDetail() {
    	
        System.out.println("Showroom Name: " + showroomName);
        System.out.println("Model: " + model);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Available: " + available);
    }
}

public class CarShowroom {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.setShowroomName("BMW Motors");
        c1.setModel("BMW 3 Series");
        c1.setMileage(18.9);
        c1.setBrand("BMW");
        c1.setPrice(4500000);
        c1.setFuelType("Petrol");
        c1.setAvailable(true);
        c1.carDetail();
        System.out.println("=============");

        Car c2 = new Car();

        c2.setShowroomName("Mercedes-Benz Motors");
        c2.setModel("Mercedes-Benz C-Class");
        c2.setMileage(16.9);
        c2.setBrand("Mercedes-Benz");
        c2.setPrice(6000000);
        c2.setFuelType("Petrol");
        c2.setAvailable(false);
        c2.carDetail();
        System.out.println("=============");
    }
}
