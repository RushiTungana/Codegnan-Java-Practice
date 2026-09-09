package comm.oop.projectGaming;

public class Warrior extends Character {
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    @Override
    public void attack() {
        System.out.println(getName() + " attacks using Sword and causes 50 damage.");
    }
}