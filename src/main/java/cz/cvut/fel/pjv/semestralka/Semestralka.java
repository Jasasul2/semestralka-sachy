
package cz.cvut.fel.pjv.semestralka;

/**
 *
 * @author ondra
 */


// SOME TESTING PIECE OF SHIT 
import java.awt.Color;

public class Semestralka {

    public static void main(String[] args) {
        
        ColorScheme cs1 = new ColorScheme(new Color(134, 148, 127), 
                                          new Color(194, 214, 184),
                                          new Color(78, 87, 75));
        
        ColorScheme cs2 = new ColorScheme(new Color(134, 148, 127),
                                          new Color(78, 87, 75),
                                          new Color(194, 214, 184));
        
        ColorScheme cs3 = new ColorScheme(new Color(194, 214, 184),
                                          new Color(78, 87, 75),
                                          new Color(134, 148, 127));
        
        ChessBoard board = new ChessBoard(540, 8, 50, cs1);
        ChessBoard board1 = new ChessBoard(540, 8, 50, cs2);        
        ChessBoard board2 = new ChessBoard(540, 8, 50, cs3);
    }   

}
