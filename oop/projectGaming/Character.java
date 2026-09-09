package comm.oop.projectGaming;

public class Character {
    private String name;
    private int health;
    private int attackPower;
    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
    }
    public void attack() {
        System.out.println(name + " attacks.");
    }
    public void updateHealth(int damage) {
        health = health - damage;

        if (health < 0) {
            health = 0;
        }
        System.out.println(name + " health is now: " + health);
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getAttackPower() {
        return attackPower;
    }
}
