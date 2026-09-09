package com.basics.oop;

abstract class Vehicle {
    private String registrationNumber;
    private String ownerName;
    private int parkingHours;
    Vehicle(String registrationNumber, String ownerName, int parkingHours) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.parkingHours = parkingHours;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public int getParkingHours() {
        return parkingHours;
    }
    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Parking Hours: " + parkingHours);
    }
    abstract void parkingSlot();
    abstract int calculateFee();
}
