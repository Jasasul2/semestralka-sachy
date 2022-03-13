package cz.cvut.fel.pjv.semestralka;

/**
 *
 * @author ondra
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessBoard {

    public int windowSize, squaresCount, borderSize;
    public Color color1, color2;

    public ChessBoard(int squaresCount, int tileSize, ColorScheme colors) {

        // Setting up the window
        int windowSize = squaresCount * (tileSize + 2);
        JFrame frame = new JFrame();
        frame.setTitle("Chess");
        frame.setLocationRelativeTo(null);
        frame.setLocationByPlatform(true);
        frame.setBounds(50, 50, windowSize, windowSize+25);
        JPanel pn = new JPanel() {
            @Override
            public void paint(Graphics g) {
                for (int i = 0; i < squaresCount; i++) {
                    for (int j = 0; j < squaresCount; j++) {
                        if ((i + j) % 2 == 0) {
                            g.setColor(colors.player1);
                        } else {
                            g.setColor(colors.player2);
                        }
                        g.fillRect(i * tileSize, j * tileSize, tileSize, tileSize);
                    }
                }
            }
        };
        frame.add(pn);
        frame.setBackground(colors.background);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Assigning the variables for later use
        this.windowSize = windowSize;
        this.squaresCount = squaresCount;
        this.borderSize = borderSize;
        this.color1 = colors.player1;
        this.color2 = colors.player2;
    }
}
