package com.basics.oop;

class ElectricCar extends Vehicle {
    ElectricCar(String registrationNumber, String ownerName, int parkingHours) {
        super(registrationNumber, ownerName, parkingHours);
    }
    @Override
    void parkingSlot() {
        System.out.println("Parking Slot: Electric Car Slot");
    }
    @Override
    int calculateFee() {
        return getParkingHours() * 30;
    }
}