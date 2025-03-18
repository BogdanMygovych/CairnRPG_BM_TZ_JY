import java.util.Random;

public class Character {
    protected String name;
    protected double health;
    protected static double attackPower;
    protected boolean isAlive;

    public Character(String name, double health, double attackPower, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.isAlive = isAlive;
    }

    public boolean runAway() {
        return new Random().nextBoolean();
    }

    public String info() {
        return "Name: " + name + ", Health: " + health + ", Attack: " + attackPower + ", Alive: " + isAlive;
    }
}
 // 🛠️ **Added these getter methods for testing**
    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    // 🛠️ **Setter method to allow modification in tests**
    public void setAlive(boolean status) {
        this.isAlive = status;
    }

    public String info() {
        return "Name: " + name + ", Health: " + health + ", Attack: " + attackPower + ", Alive: " + isAlive;
    }
}

