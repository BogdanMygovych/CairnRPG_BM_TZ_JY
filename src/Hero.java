import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hero extends Character {
    private int level;
    private int experience;
    private float money;
    List<Item> inventory;

    public Hero (float health, float attackPower, boolean runAway){
        super("Spiderman", health, attackPower, runAway);
        this.level = 1;
        this.experience = 0;
        this.money = 0.0F;
        this.inventory = new ArrayList<>();
        this.inventory.add(new Item("Potion", 20));
    }

    // all function(s) for this class
    public boolean fight(Enemy enemy){
        Random random = new Random();
        if (random.nextDouble() < .1){ // 10% chance of missing the attack
            System.out.println("Attack is missed");
            return false;
        }
        boolean specialAttack = random.nextBoolean();
        double damage;
        if (specialAttack){
            damage = Character.attackPower * 2;
            //enemy.takeDamage(damage);
            System.out.println(super.name + " attacked enemy with special attack by " + damage + " HP points.");
        }else{
            damage = Character.attackPower;
            //enemy.takeDamage(damage);
            System.out.println(super.name + " attacked enemy by " + damage + " HP points.");
        }
        return true;

    }

    public void useItem(){
        if (!inventory.isEmpty()){
            health += Item.getHealingPower();
            Item item = inventory.remove(0);
            System.out.println("A potion healed " + super.name + " by " + Item.getHealingPower() + "HP.");
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

    public String info(){
        return "This is " + super.name + ". Health: " + super.health + ", level: " + level + ", experience: " + experience + ", money: " + money + ", attack power: " + super.attackPower + ".";
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
