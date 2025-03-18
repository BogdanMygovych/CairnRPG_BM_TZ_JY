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

    public void takeDamage(double damage) {
    this.health -= damage;
    if (this.health <= 0) {
        this.health = 0;
        this.isAlive = false;
        System.out.println(name + " has been defeated.");
    }
}    
    public boolean runAway() {
        return new Random().nextBoolean();
    }

    public String info() {
        return "Character: " + name + ", Health: " + health + ", Attack: " + attackPower + ", Alive: " + isAlive;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(float attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
