package cz.cvut.fel.pjv.semestralka;

/**
 *
 * @author ondra
 */
// SOME TESTING PIECE OF SHIT 
import java.awt.Color;

public class Semestralka {

    public static void main(String[] args) {


        ColorScheme kubovoSchema = new ColorScheme(
                "kuba",
                new Color(17, 130, 59),
                new Color(0, 77, 37),
                new Color(2, 35, 28));

        ChessBoard board = new ChessBoard(540, 8, 50, kubovoSchema);
    }

}
