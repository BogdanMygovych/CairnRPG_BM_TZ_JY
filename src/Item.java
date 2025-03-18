public class Item {
    private String name;
    private int healingPower;

    public Item(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    public String info() {
        return "Item: " + name + ", Heals: " + healingPower;
    }
}
