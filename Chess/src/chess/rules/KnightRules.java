package chess.rules;

/**
 * <p>
 * Defines an interface to supply the rules for a Knight.
 * </p>
 * 
 * @author Sergio, Luli, Angus, Wilson
 * @version 1.0
 */
public interface KnightRules {
    /**
     * <p>
     * Limits how many squares the Knight can move.
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
