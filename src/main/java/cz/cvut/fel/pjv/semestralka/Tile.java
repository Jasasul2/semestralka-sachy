package cz.cvut.fel.pjv.semestralka;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Maceska, Kolar
 */
public final class Tile {

    // ----------------------------- ATTRIBUTES --------------------------------
    /**
     * Coordinates of the tile (x, y)
     */
    public Coordinates coordinates;

    /**
     * Whether the playerColor of the tile is the color of the first player (not
     * to be mistaken with the color of the piece)
     */
    public boolean isColor1;

    /**
     * Whether the tile is occupied by a piece or not
     */
    public boolean isOccupied;

    /**
     * The piece which occupies this tile
     */
    public Piece occupyingPiece;

    /**
     * The default RGB color of the given tile
     */
    private Color defaultColor;

    /**
     * Size of all tiles in pixels 
     */
    public static int size;
    
    private JPanel panel;
    
    private JPanel tileGraphics;

    // ---------------------------- CONSTRUCTOR --------------------------------
    /**
     * Coordinates of the tile (x, y)
     *
     * @param coordinates
     * @param isColor1
     * @param defaultColor
     */
    public Tile(Coordinates coordinates, boolean isColor1, Color defaultColor, JPanel panel) {
        this.coordinates = coordinates;
        this.isColor1 = isColor1;
        this.isOccupied = false; // No tile is occupied by default 
        this.defaultColor = defaultColor;
        this.panel = panel;
        InitializeGraphics();
    }

    // ------------------------------ METHODS ----------------------------------
    public void InitializeGraphics() {
        tileGraphics = new JPanel() {
            @Override
            public void paint(Graphics g) {
                g.setColor(defaultColor);
                g.fillRect(0, 0, size, size);
            }
        };
        tileGraphics.setPreferredSize(new Dimension(size, size));
        panel.add(tileGraphics, coordinates.getY(), coordinates.getX()); 
   }

    /**
     * Highlights the color of this piece to indicate a possible move
     */
    public void highlight() {

        if (isOccupied) {
            // Different color 
        }
    }

    /**
     * Returns the color of the tile to the default RGB color
     */
    public void unHighlight() {

    }

    /**
     *
     * @returns a reference to the piece which is occupying the tile
     */
    public Piece getOccupyingPiece() {
        return occupyingPiece;
    }

    /**
     *
     * @param newOccupyingPiece - sets a new piece to ocuppy this tile
     */
    public void SetOccupyingPiece(Piece newOccupyingPiece) {
        this.occupyingPiece = newOccupyingPiece;
        isOccupied = newOccupyingPiece != null;
    }

    /**
     *
     * @param newOccupyingPiece - the currently occupying piece gets captured
     */
    public void captureOccuypingPiece(Piece newOccupyingPiece) {
        occupyingPiece.getCaptured();
        SetOccupyingPiece(newOccupyingPiece);
    }

}
