package chess.board;

import javax.swing.JFrame;

/**
 *
 *
 * @author Angus Lam
 * @version Nov 22, 2016
 */
public class chessBoard {
    /**
     * This drives the program.
     * 
     * @param args
     *          command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new ChessBoardPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
