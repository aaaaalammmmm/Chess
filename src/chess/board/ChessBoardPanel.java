package chess.board;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JPanel;

/**
 * This creates the chess board.
 *
 * @author Angus Lam
 * @version Nov 22, 2016
 */
public class ChessBoardPanel extends JPanel {
    /**
     * The number of columns on a chess board.
     */
    private static final int BOARD_COLUMNS = 8;
    /**
     * The number of rows on a chess board.
     */
    private static final int BOARD_ROWS = 8;
    /**
     * This constructs the chess board panel.
     */
    public ChessBoardPanel() {
        Panel        board        = new Panel();
        Panel        border       = new Panel();
        BorderLayout borderLayout = new BorderLayout();
        GridLayout   gridLayout   = new GridLayout(BOARD_COLUMNS, BOARD_ROWS);
        
        board.setLayout(gridLayout);
        board.add(border);
        setLayout(borderLayout);
        add(board, borderLayout.CENTER);
    }
}
