public class World {
    private String gameName;
    private String publisher;

   public World(String gameName, String publisher) {
        this.gameName = gameName;
        this.publisher = publisher;
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
}

