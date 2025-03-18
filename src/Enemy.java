import java.util.Random;

public class Enemy extends Character {
    private static final String DEFAULT_NAME = "Enemy"; //enemy
    private int magicPower = 30;
    private Random randomizer = new Random();

    // Constructor 1
    public Enemy(double health, double attackPower, boolean isAlive) {
        super(DEFAULT_NAME, health, attackPower, isAlive); // gets the character
    }

    // Constructor 2
    public Enemy() {
        this(100.0, 10.0, true);
    }

public void fight(Character target) {
    if (!isAlive()) {
        System.out.println(getName() + " is already defeated and can't attack!");
        return;
    }

    boolean useMagic = randomizer.nextDouble() < 0.3; // 30% for magic
    double damage;

    if (useMagic && magicPower >= 10) {
        damage = getAttackPower() * 1.5; // More damage for magic
        magicPower -= 10; // Reduce magic power
        System.out.println(getName() + " casts a magic spell! Damage: " + damage);
    } else { // Normal attack
        damage = getAttackPower();
        System.out.println(getName() + " attacks with a weapon! Damage: " + damage);
    }

    target.takeDamage(damage); // Apply damage to the target
}


    // Display enemy details
    public String info() {
        return "Enemy: " + name +
                "\nHealth: " + health +
                "\nAttack Power: " + attackPower +
                "\nMagic Power: " + magicPower +
                "\nAlive: " + (isAlive ? "Yes" : "No");
    }
}
