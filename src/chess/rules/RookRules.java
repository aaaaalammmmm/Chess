package chess.rules;

/**
 * <p>
 * Defines an interface to supply the rules for a Rook.
 * </p>
 * 
 * @author Sergio, Luli, Angus, Wilson
 * @version 1.0
 */
public interface RookRules {
    /**
     * <p>
     * Limits how many squares the Rook can move.
     * </p>
     */
    int MOVE_LIMIT = 7;
    /**
     * <p>
     * A legal move.
     * </p>
     */
    void move();
}
