/**
 * 
 */
package chess.pieces;

import chess.rules.PawnRules;

/**
 * <p>
 * Creates a Pawn piece with a valued name (such as "White Pawn" or "Black
 * Pawn"), an X and Y position, and a team as a boolean (True = black team,
 * False = white team). The String name will help disambiguate the boolean value
 * of the team. Easier to implement than an integer.
 * </p>
 * 
 * @author Sergio
 * @version 1.0
 */
public class Pawn extends Piece implements PawnRules {
    /**
     * <p>
     * Defines the team the piece belongs to.
     * </p>
     */
    private boolean team;

    /**
     * <p>
     * Constructs the pawn with a name, x and y position on the board, and the
     * team.
     * </p>
     * 
     * @param n
     *            Accepts the name of the Pawn.
     * @param xPos
     *            Accepts the X position of the pawn on the board.
     * @param yPos
     *            Accepts the Y position of the pawn on the board.
     * @param team
     *            Accepts the team of the pawn.
     */
    public Pawn(String n, int xPos, int yPos, boolean team) {
        super.setName(n);
        super.setxVal(xPos);
        super.setyVal(yPos);
        this.team = team;
    }

    @Override
    public void move() {
        if (team) {
            if (getyVal() < MAX_Y_POS) {
                setyVal(getyVal() + 1);
            } else if (getyVal() == MAX_Y_POS) {
                transform();
            }
        } else {
            if (getyVal() > MIN_Y_POS) {
                setyVal(getyVal() - 1);
            } else if (getyVal() == MIN_Y_POS) {
                transform();
            }
        }

    }

    /**
     * <p>
     * Transforms a pawn once they reach the other end of the board.
     * </p>
     */
    private void transform() {
        // TODO Auto-generated method stub

    }

    @Override
    public void take() {
        // TODO Auto-generated method stub

    }

}
