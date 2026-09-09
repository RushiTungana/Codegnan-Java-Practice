package com.oop.animal_project;

import java.util.*;
public class AnimalUtil {
    static Scanner scanner = new Scanner(System.in);
    public static Animal createAnimal() {
        System.out.println("Enter the animal you want to create");
        while (true) {
            System.out.println("Lion, Tiger, Kangaroo");
            String animal = scanner.nextLine();
            if (animal.equalsIgnoreCase("Lion")) {
                return createLion();
            } else if (animal.equalsIgnoreCase("Tiger")) {
                return createTiger();
            } else if (animal.equalsIgnoreCase("Kangaroo")) {
                return createKangaroo();
            } else {
                System.out.println("Entered wrong animal name");
            }
        }
    }
    private static Lion createLion() {
        System.out.println("Enter Lion name: ");
        String name = scanner.nextLine();
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter kills: ");
        int kills = scanner.nextInt();
        System.out.println("Enter the age: ");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the wight: ");
        Double weight = scanner.nextDouble();
        scanner.nextLine();
        return new Lion(name, gender, kills, age, weight);
    }
    private static Tiger createTiger() {
        System.out.println("Enter Tiger name: ");
        String name = scanner.nextLine();
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter kills: ");
        int kills = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Tiger Species: ");
        String species = scanner.nextLine();
        System.out.println("Enter the tiger speed: ");
        Double speed=scanner.nextDouble();
        scanner.nextLine();
        return new Tiger(name, gender, kills, species, speed);
    }
    private static Kangaroo createKangaroo() {
        System.out.println("Enter Kangaroo name: ");
        String name = scanner.nextLine();
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter kills: ");
        int kills = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the habitat: ");
        String habitat=scanner.nextLine();
        System.out.println("Enter the Kangaroo jump height: ");
        Double height=scanner.nextDouble();
        scanner.nextLine();
        return new Kangaroo(name, gender, kills, habitat, height);
    }
}