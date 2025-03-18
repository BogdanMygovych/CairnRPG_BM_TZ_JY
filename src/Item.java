public class Item {
    private String name;
    private static int healingPower;

    public Item (String name, int healingPower){
        this.name = name;
        this.healingPower = healingPower;
    }

    // all function(s) for this class
    public String info(){
        return "This is " + name + " and its healing power is " + healingPower;
    }



    //Getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static int getHealingPower(){
        return healingPower;
    }

    public void setHealingPower( int healingPower){
        this.healingPower = healingPower;
    }
}
