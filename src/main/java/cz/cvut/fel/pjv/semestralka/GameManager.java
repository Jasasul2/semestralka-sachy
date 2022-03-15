package cz.cvut.fel.pjv.semestralka;

/**
 *
 * @author ondra
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
        this.windowSize = tileRowCount * (tileSize + 2);

        // Setting up the window
        Tile.size = tileSize;
        JFrame frame = new JFrame();
        JPanel masterPanel = new JPanel();
        masterPanel.setLayout(new GridLayout(0, 1, 50, 50));    
        masterPanel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        
        JPanel board = new JPanel();
        GridLayout boardLayout = new GridLayout(tileRowCount, tileRowCount);
        board.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        board.setLayout(boardLayout);

        // Creating the chessboard 
        chessboard = new Tile[tileRowCount][tileRowCount];
        boolean isColor1 = false;
        for (int y = 0; y < tileRowCount; y++) {
            for (int x = 0; x < tileRowCount; x++) {
                Color tileColor = color1;
                if ((y + x) % 2 == 0) {
                    isColor1 = !isColor1;
                    tileColor = color2;
                }
                chessboard[y][x] = new Tile(new Coordinates(x, y), isColor1, tileColor, board);
            }
        }
        JPanel compactPanel = new JPanel();
        compactPanel.setLayout(new FlowLayout());
        compactPanel.add(board);
        masterPanel.add(compactPanel, BorderLayout.CENTER);
        
        frame.add(masterPanel);
        frame.setTitle("Chess");
        frame.setBackground(colors.background);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    // ------------------------------ METHODS ----------------------------------
}
