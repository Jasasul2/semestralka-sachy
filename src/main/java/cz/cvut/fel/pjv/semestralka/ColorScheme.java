package cz.cvut.fel.pjv.semestralka;

import java.awt.Color;

/**
 *
 * @author Maceska, Kolar
 */
public class ColorScheme {

    // ----------------------------- ATTRIBUTES --------------------------------
    public String name;
    public Color tileColor1;
    public Color tileColor2;
    public Color player1Pieces;
    public Color player2Pieces;
    public Color background;

    // ---------------------------- CONSTRUCTOR --------------------------------

    public ColorScheme(String name, Color tileColor1, Color tileColor2, Color background) {
        this.name = name;
        this.tileColor1 = tileColor1;
        this.tileColor2 = tileColor2;
        this.background = background;
        this.player1Pieces = tileColor1;
        this.player2Pieces = tileColor2;
    }


}
