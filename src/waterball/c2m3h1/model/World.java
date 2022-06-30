package waterball.c2m3h1.model;

public class World {
    private int width;
    private int totalSprite;

    public World() {
    }

    public World(int width, int totalSprite) {
        this.width = width;
        this.totalSprite = totalSprite;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getTotalSprite() {
        return totalSprite;
    }

    public void setTotalSprite(int totalSprite) {
        this.totalSprite = totalSprite;
    }
}
