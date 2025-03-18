import java.util.Random;

public class Hero extends Character {
    private int level;
    private int experience;
    private float money;
    private Item[] inventory;

    public Hero(float health, float attackPower, boolean isAlive) {
        super("Spiderman", health, attackPower, isAlive);
        this.level = 1;
        this.experience = 0;
        this.money = 0.0f;
        this.inventory = new Item[5];
        this.inventory[0] = new Item("Potion", 20);
    }

    public boolean fight(Enemy enemy) {
        Random rand = new Random();
        boolean useSpecial = rand.nextBoolean();
        boolean hit = rand.nextInt(100) > 10;

        if (!hit) {
            System.out.println(getName() + "Attack is missed!");
            return false;
        }

        float damage = getAttackPower() * (useSpecial ? 2 : 1);
        System.out.println(getName() + (useSpecial ? " used a special attack!" : " attacked") +
                " and dealt " + damage + " damage points to " + enemy.getName());
        return true;
    }

    public int useItem(int index) {
        if (index < inventory.length && inventory[index] != null) {
            int healing = inventory[index].getHealingPower();
            setHealth(getHealth() + healing);
            System.out.println(inventory[index].getName() + " healed " + getName() + " by " + healing + " HP.");
            inventory[index] = null;
            return healing;
        }
        return 0;
    }

    public boolean addToInventory(Item item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                return true;
            }
        }
        return false;
    }

    public void levelUp() {
        if (experience > 100) {
            level++;
            experience = 0;
            setHealth(getHealth() * 1.1f);
            setAttackPower(getAttackPower() * 1.1f);
            System.out.println(getName() + " is level  " + level + "!");
        }
    }

    public String showInventory() {
        StringBuilder sb = new StringBuilder();
        for (Item item : inventory) {
            if (item != null) sb.append(item.info()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String info() {
        return super.info() + ", Level: " + level + ", Experience: " + experience + ", Money: " + money;
    }



    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public float getMoney() {
        return money;
    }
    public void setMoney(float money) {
        this.money = money;
    }

    public Item[] getInventory() {
        return inventory;
    }
    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }
}
