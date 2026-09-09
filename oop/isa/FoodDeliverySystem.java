package comm.oop.isa;

import java.util.*;

public class FoodDeliverySystem {
    static class DeliveryPartner {
        private int id;
        private String name;
        private double baseSalary;
        private double totalEarnings;
        DeliveryPartner(int id, String name, double baseSalary) {
            this.id = id;
            this.name = name;
            this.baseSalary = baseSalary;
        }
        void displayDetails() {
            System.out.println("Partner ID     : " + id);
            System.out.println("Partner Name   : " + name);
            System.out.println("Base Salary    : " + baseSalary);
        }
        double getRatePerKm() {
            return 0;
        }
        void startDelivery(double distance) {
            double charge = distance * getRatePerKm();
            totalEarnings = totalEarnings + charge;

            System.out.println("Delivery Started");
            System.out.println("Distance       : " + distance + " km");
            System.out.println("Rate per KM    : ₹" + getRatePerKm());
            System.out.println("Delivery Charge: ₹" + charge);
            System.out.println("Total Earnings : ₹" + totalEarnings);
        }
    }
    static class BikePartner extends DeliveryPartner {

        BikePartner(int id, String name, double baseSalary) {
            super(id, name, baseSalary);
        }
        @Override
        double getRatePerKm() {
            return 10;
        }
    }
    static class CarPartner extends DeliveryPartner {
        CarPartner(int id, String name, double baseSalary) {
            super(id, name, baseSalary);
        }
        @Override
        double getRatePerKm() {
            return 20;
        }
    }

    static class EVPartner extends DeliveryPartner {

        EVPartner(int id, String name, double baseSalary) {
            super(id, name, baseSalary);
        }

        @Override
        double getRatePerKm() {
            return 8;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== FOOD DELIVERY PARTNER SYSTEM =====");
        System.out.print("Enter Partner ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Partner Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Base Salary: ");
        double salary = sc.nextDouble();
        System.out.println("\nSelect Partner Type:");
        System.out.println("1. Bike Partner");
        System.out.println("2. Car Partner");
        System.out.println("3. EV Partner");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        DeliveryPartner partner;
        if (choice == 1) {
            partner = new BikePartner(id, name, salary);
        } 
        else if (choice == 2) {
            partner = new CarPartner(id, name, salary);
        } 
        else if (choice == 3) {
            partner = new EVPartner(id, name, salary);
        } 
        else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }
        System.out.println("\n===== PARTNER DETAILS =====");
        partner.displayDetails();
        System.out.print("\nEnter delivery distance in KM: ");
        double distance = sc.nextDouble();
        System.out.println("\n===== DELIVERY =====");
        partner.startDelivery(distance);
        System.out.print("\nDo you want to start another delivery? (yes/no): ");
        sc.nextLine();
        String answer = sc.nextLine();
        while (answer.equalsIgnoreCase("yes")) {
            System.out.print("Enter delivery distance in KM: ");
            distance = sc.nextDouble();
            partner.startDelivery(distance);
            sc.nextLine();
            System.out.print("Do you want another delivery? (yes/no): ");
            answer = sc.nextLine();
        }
        System.out.println("\n===== FINAL DETAILS =====");
        partner.displayDetails();
        sc.close();
    }
}
