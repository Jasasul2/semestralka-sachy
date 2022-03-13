package cz.cvut.fel.pjv.semestralka;

/**
 *
 * @author ondra
 */
public abstract class Piece {

    public boolean isColor1;
    private pieceType type;
    private Coordinates coordinates;
    private int value;

    public Piece(boolean isColor1, Coordinates coordinates) {
        this.isColor1 = isColor1;
        this.coordinates = coordinates;
    }

    public pieceType getType() {
        return type;
    }

    public void setType(pieceType type) {
        this.type = type;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void getCaptured() {

    }

    public abstract Coordinates[] getPossibleMoves();
}
