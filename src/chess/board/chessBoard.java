package chess.board;

import java.awt.Color;

import javax.swing.JFrame;

/**
 *
 *
 * @author Angus Lam
 * @version Nov 22, 2016
 */
public class chessBoard extends JFrame {
    /**
     * <p>
     * Defines the width of the chess board.
     * </p>
     */
    private static final int WIDTH = 650;
    /**
     * <p>
     * Defines the height of the chess board.
     * </p>
     */
    private static final int HEIGHT = 650;

    /**
     * <p>
     * Constructs the chess board.
     * </p>
     */
    public chessBoard() {
        super("Chess Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.white);
        setContentPane(new ChessBoardPanel());
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }

    /**
     * This drives the program.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        new chessBoard();
    }
}
