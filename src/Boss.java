import java.util.Random;

public class Boss extends Enemy {
    private int ultrasLeft;

    public Boss() {
        super(150.0f, 20.0f, true);
        this.ultrasLeft = 3;
        this.setName("KillerClown");
    }

    @Override
    public boolean fight(Hero hero) {
        Random rand = new Random();
        if (ultrasLeft > 0 && rand.nextInt(100) < 30) {
            ultrasLeft--;
            System.out.println(getName() + " used Primary attack on " + hero.getName() + "!");
        } else {
            System.out.println(getName() + " attack " + hero.getName() + " with a normal attack.");
        }
        return rand.nextInt(100) > 15;
    }

    @Override
    public String info() {
        return super.info() + ", Primaries Left: " + ultrasLeft;
    }

    public int getUltrasLeft() { return ultrasLeft; }
    public void setUltrasLeft(int ultrasLeft) { this.ultrasLeft = ultrasLeft; }
}
