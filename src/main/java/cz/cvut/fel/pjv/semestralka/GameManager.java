package cz.cvut.fel.pjv.semestralka;

/**
 *
 * @author ondra
 */
import java.awt.Color;
import javax.swing.JFrame;

public class GameManager {

    // ----------------------------- ATTRIBUTES --------------------------------
    public int windowSize;
    public int squaresCount;
    public Color color1;
    public Color color2;
    public Tile[][] chessboard;

    // ---------------------------- CONSTRUCTOR --------------------------------
    public GameManager(int tileRowCount, int tileSize, ColorScheme colors) {

        // Assigning the variables for later use
        this.squaresCount = tileRowCount;
        this.color1 = colors.tileColor1;
        this.color2 = colors.tileColor2;

        // Setting up the window
        Tile.size = tileSize;
        windowSize = tileRowCount * (tileSize + 2);
        JFrame frame = new JFrame();
        frame.setTitle("Chess");
        frame.setLocationRelativeTo(null);
        frame.setLocationByPlatform(true);
        frame.setBounds(50, 50, windowSize, windowSize + 25);

        // Creating the chessboard 
        chessboard = new Tile[tileRowCount][tileRowCount];
        for (int y = 0; y < tileRowCount; y++) {
            for (int x = 0; x < tileRowCount; x++) {
                boolean isColor1 = false;
                Color tileColor = color1;
                if ((y + x) % 2 == 0) {
                    isColor1 = true;
                    tileColor = color2;
                }

                chessboard[y][x] = new Tile(new Coordinates(x, y), isColor1, tileColor, frame);
            }
        }
        frame.setBackground(colors.background);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    // ------------------------------ METHODS ----------------------------------
}
