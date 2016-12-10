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
     * @param name
     *            Accepts the name of the Pawn.
     * @param xPos
     *            Accepts the X position of the pawn on the board.
     * @param yPos
     *            Accepts the Y position of the pawn on the board.
     * @param team
     *            Accepts the team of the pawn.
     */
    public Pawn(String name, int xPos, int yPos, boolean team) {
        super(name, xPos, yPos);
        setTeam(team);
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
     * Returns which team pawn piece belongs to.
     * True  = black team
     * False = white team
     * 
     * @return Which team the pawn piece belongs to
     */
    public boolean isTeam() {
        return team;
    }

    /**
     * Sets which team the pawn piece belongs to.
     * True  = black team
     * False = white team
     * 
     * @param team
     *          The team the pawn piece belongs to
     */
    public void setTeam(boolean team) {
        this.team = team;
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
