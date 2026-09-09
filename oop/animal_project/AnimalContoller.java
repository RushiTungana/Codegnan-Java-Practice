package com.oop.animal_project;

import java.util.*;
public class AnimalContoller {
    static AnimalRepository animalrepo = new AnimalRepository();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            System.out.println("\n1. Save");
            System.out.println("2. Get All");
            System.out.println("3. Get Animal");
            System.out.println("4. Exit");
            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
            case 1:
                saveAnimal();
                break;
            case 2:
                getAllAnimals();
                break;
            case 3:
                getAnimal(); 
                break;
            case 4:
                System.out.println("App is exited");
                condition = false;
                break;
            default:
                System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
    private static void saveAnimal() {
        Animal animal = AnimalUtil.createAnimal();
        animalrepo.saveAnimal(animal);
    }
    private static void getAllAnimals() {
        System.out.println("\n===== All Animals =====");
        animalrepo.getAllAnimals();
    }
    public static void getAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter animal name: ");
        String name = sc.nextLine();
        Animal animal = animalrepo.getAnimal(name);
        if (animal != null) {
            animal.animalDetails();
        } else {
            System.out.println("Animal not found");
        }
    }
}