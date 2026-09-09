package com.basics.oop;

class ParkingSystem {
    public int calculateFee(Vehicle vehicle) {
        return vehicle.calculateFee();
    }
    public int calculateFee(Vehicle vehicle, boolean weekend) {
        int fee = vehicle.calculateFee();
        if (weekend) {
            fee = fee + (fee * 10 / 100);
        }
        return fee;
    }
}
