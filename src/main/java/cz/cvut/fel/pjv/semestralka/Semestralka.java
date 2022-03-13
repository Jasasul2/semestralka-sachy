package cz.cvut.fel.pjv.semestralka;

/**
 *
 * @author ondra
 */
// SOME TESTING PIECE OF SHIT 
import java.awt.Color;

public class Semestralka {

    public static void main(String[] args) {

        ColorScheme basic = new ColorScheme(
                "Basic",
                new Color(17, 130, 59),
                new Color(0, 77, 37),
                new Color(2, 35, 28));

        ColorScheme GaY = new ColorScheme(
                "Green & Yellow",
                new Color(113, 139, 79),
                new Color(233, 234, 204),
                new Color(0, 0, 0));

        ChessBoard board = new ChessBoard(8, 64, GaY);
    }

}
