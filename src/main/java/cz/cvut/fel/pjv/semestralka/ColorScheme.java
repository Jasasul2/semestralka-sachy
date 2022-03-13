package cz.cvut.fel.pjv.semestralka;

import java.awt.Color;

/**
 *
 * @author ondra
 */
public class ColorScheme {

    public String name;
    public Color tileColor1,
            tileColor2,
            playerPieces1,
            playerPieces2,
            background;

    public ColorScheme(String name, Color player1, Color player2, Color background) {
        this.name = name;
        this.tileColor1 = player1;
        this.tileColor2 = player2;
        this.playerPieces1 = player1;
        this.playerPieces2 = player2;
        this.background = background;
    }
}
