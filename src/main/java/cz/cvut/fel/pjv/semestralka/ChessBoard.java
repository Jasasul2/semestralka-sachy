package cz.cvut.fel.pjv.semestralka;

/**
 *
 * @author ondra
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class ChessBoard extends JFrame {

    public int windowSize, squaresCount, borderSize;
    public Color color1, color2;

    public ChessBoard(int windowSize, int squaresCount, int borderSize, ColorScheme colors) {

        // Setting up the window 
        setTitle("Chess");
        setSize(windowSize + 2 * borderSize, windowSize + 2 * borderSize);
        setVisible(true);
        setBackground(colors.background);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Assigning the variables for later use
        this.windowSize = windowSize;
        this.squaresCount = squaresCount;
        this.borderSize = borderSize;
        this.color1 = colors.player1;
        this.color2 = colors.player2;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Drawing the chess pieces 
        int colorIndex = 0;
        Color[] colors = new Color[]{color1, color2};
        int recSize = windowSize / squaresCount; 
        
        for (int y = 0; y < squaresCount; y++) {
            for (int x = 0; x < squaresCount; x++) {
                
                g.setColor(colors[colorIndex]);
                g2d.fillRect(borderSize + x * recSize, borderSize + y * recSize, recSize, recSize);
                
                colorIndex++;
                colorIndex = colorIndex % 2;
            }
            colorIndex++;
            colorIndex = colorIndex % 2;
        }
    }
}
