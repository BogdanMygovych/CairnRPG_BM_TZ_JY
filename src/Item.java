public class Item {
    private String name;
    private int healingPower;

    public Item(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }

    public String info() {
        return "Item: " + name + ", Heals: " + healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public String getName() {
        return name;
    }
}