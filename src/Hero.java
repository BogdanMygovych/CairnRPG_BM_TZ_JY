import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hero extends Character {
    private static int level;
    private static int experience;
    private static float money;
    List<Item> inventory;

    public Hero (float health, float attackPower, boolean runAway){
        super("Spiderman", health, attackPower, runAway);
        this.level = 1;
        this.experience = 0;
        this.money = 0.0F;
        this.inventory = new ArrayList<>();
        this.inventory.add(new Item("Potion", 20));
    }

public boolean fight(Enemy enemy) {
    Random random = new Random();
    if (random.nextDouble() < 0.1) { // 10% chance of missing the attack
        System.out.println("Attack is missed");
        return false;
    }

    boolean specialAttack = random.nextBoolean();
    double damage;

    if (specialAttack) {
        damage = getAttackPower() * 2;
        System.out.println(getName() + " attacked enemy with special attack by " + damage + " HP points.");
    } else {
        damage = getAttackPower();
        System.out.println(getName() + " attacked enemy by " + damage + " HP points.");
    }

    enemy.takeDamage(damage);
    return true;
}


public void useItem() {
    if (!inventory.isEmpty()) {
        Item item = inventory.remove(0);
        setHealth(getHealth() + item.getHealingPower());
        System.out.println("A potion healed " + getName() + " by " + item.getHealingPower() + " HP.");
    } else {
        System.out.println("Inventory is empty!");
    }
}


    public void levelUp(){
        if(experience >= 100){
            level++;
            experience -= 100;
            health += health * .1;
            attackPower += attackPower * .1;
            System.out.println("Hero just leveled up, its health and attack power were increased by 10% and remaining experience is " + experience + ".");
        }
    }

    public boolean addToInventory(Item item){
        return (inventory.size() < 5) ? inventory.add(item) : false;
    }

    public String showInventory(){
        StringBuilder inventoryList = new StringBuilder("Inventory: ");
        for (Item item : inventory){
            inventoryList.append("\n").append(item.toString());
        }
        return inventoryList.toString();
    }

    public static String info(){
        return "This is " + name + ". Health: " + health + ", level: " + level + ", experience: " + experience + ", money: " + money + ", attack power: " + attackPower + ".";
    }



    //getters and setters
    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getExperience(){
        return experience;
    }

    public void setExperience(int experience){
        this.experience = experience;
    }

    public float getMoney(){
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
