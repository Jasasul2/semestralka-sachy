package cz.cvut.fel.pjv.semestralka;

/**
 *
 * @author Maceska, Kolar
 */
public class Coordinates {

    // ----------------------------- ATTRIBUTES --------------------------------
    private int x;
    private int y;

    // ---------------------------- CONSTRUCTOR --------------------------------
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // ------------------------------ METHODS ----------------------------------
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
}
