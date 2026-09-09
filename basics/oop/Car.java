package com.basics.oop;
class Car extends Vehicle {
    Car(String registrationNumber, String ownerName, int parkingHours) {
        super(registrationNumber, ownerName, parkingHours);
    }
    @Override
    void parkingSlot() {
        System.out.println("Parking Slot: Car Slot");
    }
    @Override
    int calculateFee() {
        return getParkingHours() * 50;
    }
}
