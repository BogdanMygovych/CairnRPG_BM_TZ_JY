public class World {
    private String gameName;
    private String publisher;

    public World() {
        this.gameName = "CairnRPG Game";
        this.publisher = "Bogdan, Tykhyk, Jonah";
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String info() {
        return "Game: " + gameName + ", Publisher: " + publisher;
    }
}
