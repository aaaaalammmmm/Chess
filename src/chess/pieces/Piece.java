package chess.pieces;

/**
 * <p>
 * Master Piece class.
 * </p>
 * 
 * @author Sergio, Luli, Angus, Wilson
 * @version 1.0
 */
public abstract class Piece {
    /**
     * <p>
     * Name of the piece.
     * </p>
     */
    private String name;
    /**
     * <p>
     * X position on the board.
     * </p>
     */
    private int xVal;
    /**
     * <p>
     * Y position on the board.
     * </p>
     */
    private int yVal;

    /**
     * <p>
     * Gets the X value.
     * </p>
     * 
     * @return the xVal
     */
    public int getxVal() {
        return xVal;
    }

    /**
     * <p>
     * Sets the X value.
     * </p>
     * 
     * @param xVal
     *            the xVal to set
     */
    public void setxVal(int xVal) {
        this.xVal = xVal;
    }

    /**
     * <p>
     * Gets the Y value.
     * </p>
     * 
     * @return the yVal
     */
    public int getyVal() {
        return yVal;
    }

    /**
     * <p>
     * Sets the X value.
     * </p>
     * 
     * @param yVal
     *            the yVal to set
     */
    public void setyVal(int yVal) {
        this.yVal = yVal;
    }

    /**
     * <p>
     * Gets the name of the piece.
     * </p>
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Sets the name of the piece.
     * </p>
     * 
     * @param n
     *            Accepts the name of the piece.
     */
    public void setName(String n) {
        name = n;
    }
}
