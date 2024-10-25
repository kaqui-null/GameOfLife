package Game;

public class Cell {

    private boolean isAlive = false;


    private int x;
    private int y;
    private int[] coords;

    public Cell(boolean isAlive, int x, int y) {
        this.isAlive = isAlive;
        this.x = x;
        this.y = y;
        this.coords = new int[]{this.x, this.y};
    }

    public boolean getAlive() {
        return this.isAlive;
    }

    public void setAlive(boolean state) {
        this.isAlive = state;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getCoords() {
        return coords;
    }

    public void setCoords(int[] coords) {
        this.coords = coords;
    }

}
