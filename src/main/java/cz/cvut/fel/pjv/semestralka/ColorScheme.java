package cz.cvut.fel.pjv.semestralka;

import java.awt.Color;

/**
 *
 * @author ondra
 */
public class ColorScheme {
    
    public String name;
    public Color player1;
    public Color player2;
    public Color background;

    public ColorScheme(String name, Color player1, Color player2, Color background) {
        this.name = name;
        this.player1 = player1;
        this.player2 = player2;
        this.background = background;
    }
}
