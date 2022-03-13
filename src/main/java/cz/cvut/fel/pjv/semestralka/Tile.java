package cz.cvut.fel.pjv.semestralka;

/**
 *
 * @author ondra
 */
public class Tile {

    public Coordinates coordinates;
    public boolean isOccupied;
    public boolean isColor1;
    public Piece occupyingPiece;

    public void highlight() {

        if (isOccupied) {
            // Different color 
        }
    }

    public void unHighlight() {
        
    }

    public Piece getOccupyingPiece() {
        return occupyingPiece;
    }
    
    public void SetOccupyingPiece(Piece newOccupyingPiece) {
        this.occupyingPiece = newOccupyingPiece;
        isOccupied = newOccupyingPiece != null;
    }

    public void kickOccupyingPiece(Piece newOccupyingPiece) {
        occupyingPiece.destroy();
        SetOccupyingPiece(newOccupyingPiece);
    }
    
}
