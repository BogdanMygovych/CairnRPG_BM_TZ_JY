import java.util.Random;

public class Character {
    protected static String name;
    protected static double health;
    protected static double attackPower;
    protected static boolean isAlive;

    public Character(String name, double health, double attackPower, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.isAlive = isAlive;
    }

    public boolean runAway() {
        return new Random().nextBoolean();
    }

    public static String info() {
        return "Name: " + name + ", Health: " + health + ", Attack: " + attackPower + ", Alive: " + isAlive;
    }

}

