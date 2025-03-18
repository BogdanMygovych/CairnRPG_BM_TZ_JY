import java.util.Random;

public class Character {
    private String name;
    private float health;
    private float attackPower;
    private boolean isAlive;

    public Character(String name, float health, float attackPower, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.isAlive = isAlive;
    }

    public boolean runAway() {
        return new Random().nextBoolean();
    }

    public String info() {
        return "Name: " + name + ", Health: " + health + ", Attack Power: " + attackPower + ", Alive: " + isAlive;
    }

    // Getters and Setters
    public String getName() { return name; }
    public float getHealth() { return health; }
    public float getAttackPower() { return attackPower; }
    public boolean getIsAlive() { return isAlive; }

    public void setName(String name) { this.name = name; }
    public void setHealth(float health) { this.health = health; }
    public void setAttackPower(float attackPower) { this.attackPower = attackPower; }
    public void setIsAlive(boolean isAlive) { this.isAlive = isAlive; }
}
