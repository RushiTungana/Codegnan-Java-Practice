package comm.oop.projectGaming;

public class GamingCharacterMain {
    public static void main(String[] args) {
        Character warrior = new Warrior("Thor", 100, 50);
        Character wizard = new Wizard("Harry", 100, 80);
        Character archer = new Archer("Robin", 100, 60);
        System.out.println("----- WARRIOR -----");
        warrior.displayInfo();
        warrior.attack();
        warrior.updateHealth(20);
        System.out.println();
        System.out.println("----- WIZARD -----");
        wizard.displayInfo();
        wizard.attack();
        wizard.updateHealth(30);
        System.out.println();
        System.out.println("----- ARCHER -----");
        archer.displayInfo();
        archer.attack();
        archer.updateHealth(40);
    }
}