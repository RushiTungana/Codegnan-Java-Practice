package com.basics.oop;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== SMART PARKING SYSTEM =====");
        System.out.print("Enter Registration Number: ");
        String registrationNumber = sc.nextLine();
        System.out.print("Enter Owner Name: ");
        String ownerName = sc.nextLine();
        System.out.print("Enter Parking Hours: ");
        int parkingHours = sc.nextInt();
        System.out.println("\nSelect Vehicle Type:");
        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Electric Car");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        Vehicle vehicle;
        if (choice == 1) {
            vehicle = new Bike(registrationNumber, ownerName, parkingHours);
        } 
        else if (choice == 2) {
            vehicle = new Car(registrationNumber, ownerName, parkingHours);
        } 
        else if (choice == 3) {
            vehicle = new ElectricCar(registrationNumber, ownerName, parkingHours);
        } 
        else {
            System.out.println("Invalid vehicle type!");
            sc.close();
            return;
        }
        System.out.println("\n===== VEHICLE DETAILS =====");
        vehicle.displayDetails();
        vehicle.parkingSlot();
        System.out.println("Normal Parking Fee: ₹" +
                vehicle.calculateFee());
        System.out.print("Is it weekend parking? (true/false): ");
        boolean weekend = sc.nextBoolean();
        ParkingSystem parkingSystem = new ParkingSystem();
        System.out.println("Parking Fee: ₹" +
                parkingSystem.calculateFee(vehicle, weekend));
        sc.close();
    }
}