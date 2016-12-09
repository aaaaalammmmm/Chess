package chess.rules;

/**
 * <p>
 * Defines an interface to supply the rules for a Pawn.
 * </p>
 * 
 * @author Sergio, Luli, Angus, Wilson
 * @version 1.0
 */
public interface PawnRules extends Rules {
    /**
     * <p>
     * Limits how many squares the Pawn can move.
     * </p>
     */
    int MOVE_LIMIT = 1;

    /**
     * <p>
     * A legal move.
     * </p>
     */
    void move();
}
