import java.util.Random;

public class Enemy extends Character {
    private int magicPoints;

    public Enemy(float health, float attackPower, boolean isAlive) {
        super("KillerBalloonDog", health, attackPower, isAlive);
        this.magicPoints = 30;
    }

    public Enemy() {
        this(100.0f, 10.0f, true);
    }

    public boolean fight(Hero hero) {
        Random rand = new Random();
        boolean useMagic = rand.nextBoolean() && magicPoints >= 10;

        if (useMagic) {
            magicPoints -= 10;
            System.out.println(getName() + " shot a spell attack on " + hero.getName());
        } else {
            System.out.println(getName() + " attacked " + hero.getName() + " with a normal attack.");
        }

        return rand.nextInt(100) > 10;
    }

    @Override
    public String info() {
        return super.info() + ", Magic Points: " + magicPoints;
    }

    public int getMagicPoints() { return magicPoints; }
    public void setMagicPoints(int magicPoints) { this.magicPoints = magicPoints; }
}
