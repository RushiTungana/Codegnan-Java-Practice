package comm.oop.projectGaming;

public class Wizard extends Character {

    public Wizard(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    @Override
    public void attack() {
        System.out.println(getName() + " attacks using Magic and causes 80 damage.");
    }
}
