package chess.rules;

/**
 * <p>
 * Defines the rules that apply for every piece in the game. Also sets a "take"
 * method for when pieces need to take others.
 * </p>
 * 
 * @author Sergio
 * @version 1.0
 */
public interface Rules {
    /**
     * <p>
     * Defines the maximum X value.
     * </p>
     */
    int MAX_X_POS = 7;
    /**
     * <p>
     * Defines the maximum Y value.
     * </p>
     */
    int MAX_Y_POS = 7;
    /**
     * <p>
     * Defines the minimum X value.
     * </p>
     */
    int MIN_X_POS = 0;
    /**
     * <p>
     * Defines the minimum Y value.
     * </p>
     */
    int MIN_Y_POS = 0;

    /**
     * <p>
     * Defines a method to take another piece.
     * </p>
     */
    void take();
}
