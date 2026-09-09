package com.basics.oop;

class Bike extends Vehicle {
    Bike(String registrationNumber, String ownerName, int parkingHours) {
        super(registrationNumber, ownerName, parkingHours);
    }
    @Override
    void parkingSlot() {
        System.out.println("Parking Slot: Bike Slot");
    }
    @Override
    int calculateFee() {
        return getParkingHours() * 20;
    }
}