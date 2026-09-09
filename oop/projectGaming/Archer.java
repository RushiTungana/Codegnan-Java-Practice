package comm.oop.projectGaming;

public class Archer extends Character {
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    @Override
    public void attack() {
        System.out.println(getName() + " attacks using Arrows and causes 60 damage.");
    }
}