public class World {
    private String terrain;
    private int difficulty;

    public World() {
        this.terrain = "Plains";
        this.difficulty = 1;
    }

    public String info() {
        return "Terrain: " + terrain + ", Difficulty: " + difficulty;
    }
}