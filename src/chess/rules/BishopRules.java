package chess.rules;

/**
 * <p>
 * Defines an interface to supply the rules for a Bishop.
 * </p>
 * 
 * @author Sergio, Luli, Angus, Wilson
 * @version 1.0
 */
public interface BishopRules {
    /**
     * <p>
     * Limits how many squares the Bishop can move.
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
