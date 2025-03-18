public class Item {
private String name;
private int healingPower;


    public Item (String name, int healingPower){
        this.name = name;
        this.healingPower = healingPower;
    }

    // all function(s) for this class
    public static String info(){
        return "This is " + name + " and its healing power is " + healingPower;
    }

    

    //Getters and setters
    public String getName() {
    return name;
}

    public void setName(String name){
        this.name = name;
    }

public int getHealingPower() {
    return healingPower;
}

    public void setHealingPower( int healingPower){
        this.healingPower = healingPower;
    }
}
