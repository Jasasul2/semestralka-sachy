package cz.cvut.fel.pjv.semestralka;

/**
 *
 * @author ondra
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameManager {

    // ----------------------------- ATTRIBUTES --------------------------------
    public int squaresCount;
    public Color color1;
    public Color color2;
    public Tile[][] chessboard;
    private final JFrame frame;
    private final JPanel masterPanel;
    private final JPanel board;

    // ---------------------------- CONSTRUCTOR --------------------------------
    public GameManager(int tileRowCount, int tileSize, ColorScheme colors) {

        // Assigning the variables for later use
        this.squaresCount = tileRowCount;
        this.color1 = colors.tileColor1;
        this.color2 = colors.tileColor2;

        // Setting up the window
        Tile.size = tileSize;
        frame = new JFrame();
        masterPanel = new JPanel();
        masterPanel.setLayout(new FlowLayout());
        masterPanel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        
        JPanel boardGrid = new JPanel();
        boardGrid.setBorder(BorderFactory.createEmptyBorder());
        boardGrid.setLayout(new GridLayout(tileRowCount, tileRowCount));
        
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
                chessboard[y][x] = new Tile(new Coordinates(x, y), isColor1, tileColor, boardGrid);
            }
        }
        board = new JPanel();
        board.setLayout(new FlowLayout());
        board.add(boardGrid);
        
        // Creating board title
        JLabel boardTitle = new JLabel();
        boardTitle.setText("Chess Board");
        
        // Adding all widgets to main panel
        masterPanel.add(boardTitle);
        masterPanel.add(board);
        
        // Window settings
        frame.add(masterPanel);
        frame.setTitle("Chess");
        frame.setBackground(colors.background);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(600,650));
        frame.pack();
        frame.setSize(new Dimension(600,650));
        frame.setVisible(true);
    }
    
    // ------------------------------ METHODS ----------------------------------
}
