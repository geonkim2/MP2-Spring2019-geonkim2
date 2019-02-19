package edu.illinois.cs.cs125.spring2019.mp2.lib;

/**
 * A class that implements a Connect4-like game.
 * ConnectN is a tile-based game played on a grid. Like Connect4, players try to get a run of tiles of a given length (N).
 * However, unlike Connect4 ConnectN does not check diagonal runs, although you can add this feature if you like.
 * This ConnectN class is also not responsible for tracking players turns.
 * That could be done by a separate class, allowing for game variations in which players can sometimes take more than one turn in a row.
 * Other variations allow more than two players.
 * In any case, the ConnectN class only monitors gameplay to determine when the game has ended, then determines the winning player.
 */
public class ConnectN {

    /**
     * Minimum board width is 6.
     */
    public static final int MIN_WIDTH = 6;

    /**
     * Maximum board width is 16.
     */
    public static final int MAX_WIDTH = 16;

    /**
     * Minimum board height is 6.
     */
    public static final int MIN_HEIGHT = 6;

    /**
     * Maximum board height is 16.
     */
    public static final int MAX_HEIGHT = 16;

    /**
     * Minimum board N value is 4.
     */
    public static final int MIN_N = 4;


    /**
     * Creates a new ConnectN board with a given width, height, and N value.
     * Note that this method should not reject invalid values.
     * Constructors must return a new object, or throw an exception, so there is no way for you to reject bad parameters yet.
     * Instead, attempts to set the width, height, or N value to invalid value should lead to them being uninitialized.
     * For example, new ConnectN(1, 10, 4) should return a ConnectN game with width=0, height=10, and N=0,
     * since 1 is an invalid width (too small) and N cannot be set until the width is defined.
     * @param setWidth - the width for the new ConnectN board
     * @param setHeight - the height for the new ConnectN board
     * @param setN - the N value for the new ConnectN board
     */
    public ConnectN(int setWidth, int setHeight, int setN) {

    }

    /**
     * Create a new ConnectN board with uninitialized width, height, and N value.
     */
    public ConnectN() {

    }

    /**
     * Create a new ConnectN board with given width and height, but uninitialized N value.
     * See the notes for the width, height, N ConnectN constructor.
     * @param setWidth - the width for the new ConnectN board
     * @param setHeight - the height for the new ConnectN board
     */
    public ConnectN(int setWidth, int setHeight) {

    }

    /**
     * Create a new ConnectN board with dimensions and N value copied from another board.
     * This is a so-called copy constructor.
     * It takes another object of the same type (in this case, a ConnectN board) and initializes a new object using values from the existing object.
     * In this case, you should use the width, height, and N value from the passed board.
     * You should not copy any other features of the other board like its board state.
     * @param otherBoard - the ConnectN board to copy width, height, and N from
     */
    public ConnectN(ConnectN otherBoard) {

    }

    /**
     * Get the current board width.
     * @return the current board width
     */
    public int getWidth() {
        return 0;
        //return this.getBoard().length;
    }

    /**
     * Attempt to set the board width.
     * Fails if the width is invalid, or if the game has already started.
     * If the new width would cause the current N value to become invalid by the rules in the setN documentation,
     * setWidth should reset the current N value to zero.
     * @param setWidth - the new width to set
     * @return true if the width was set successfully, false on error
     */
    public boolean setWidth(int setWidth) {
        //this.getBoard().length = setWidth;
        return true;
    }

    /**
     * Get the current board height.
     * @return the current board height
     */
    public int getHeight() {
        return 0;
        //return this.getBoard()[0].length;
    }

    /**
     * Attempt to set the board height.
     * Fails if the height is invalid, or if the game has already started.
     * If the new height would cause the current N value to become invalid by the rules in the setN documentation,
     * setHeight should reset the current N value to zero.
     * @param setHeight - the new height to set
     * @return true if the height was set successfully, false on error
     */
    public boolean setHeight(int setHeight) {
        //this.getBoard()[0].length = setHeight;
        return true;
    }

    /**
     * Get the current board N value.
     * @return the current board N value
     */
    public int getN() {
        return 0;
    }

    /**
     * Attempt to set the current board N value.
     * Note that:
     * N cannot be set after the game has started
     * N cannot be set before the width or the height
     * N cannot be less than 4
     * N can be at most 1 less than the maximum of the width and height
     * Games with large N values relative to their dimension are fairly uninteresting,
     * since it is trivial for a player to block their opponent and cause a draw.
     * But you should only enforce the constraint that the N value is at most 1 less than the maximum of the width and height.
     * So on a 6x10 board, the minimum N value is 4 and the maximum is 9. On a 10x8 board, the minimum is 4 and the maximum is 9.
     * Setting N should never affect the width or the height.
     * @param newN - the new N
     * @return true if N was set successfully, false otherwise
     */
    public boolean setN(int newN) {
        return true;
    }

    /**
     * Set the board at a specific position.
     * Allows a player to attempt to place a tile at a specific location on the board.
     * If the move is successful, the board should track that this player has played at this location
     * so that it can determine a winner and prevent future invalid moves.
     * A move should fail and return false if:
     * any board parameters remain uninitialized, including width, height, and N
     * the player is invalid
     * the position is invalid for this board
     * the game has already ended
     * This function also needs to enforce the rules of ConnectN.
     * A tile cannot be played at a particular location if there are empty squares below it.
     * Put another way, a tile can only be placed on top of a stack of existing tiles.
     * If the requested location is invalid, you should return false and no tile should be added to the board.
     * If a given play results in the game ending, future plays should fail and getWinner() should return the player that won.
     * Note that the first successful call to setBoardAt represents the start of game.
     * @param player - the player attempting the move
     * @param setX - the X coordinate that they are trying to place a tile at
     * @param setY - the Y coordinate that they are trying to place a tile at
     * @return true if the move succeeds, false on error
     */
    public boolean setBoardAt(Player player, int setX, int setY) {
        return true;
    }

    /**
     * Drop a tile in a particular column.
     * This method is similar to setBoardAt(player, x, y), but it does not specify a Y coordinate.
     * Instead, it allows a player to try to drop a tile on the stack with the given X value.
     * This method should fail for the same reasons as setBoardAt(player, x, y).
     * It should also fail if this stack is full and cannot accept any additional tiles.
     * It should also ensure that getWinner() returns the correct value after every play.
     * Note that the first successful call to setBoardAt represents the start of the game.
     * @param player - the player attempting the move
     * @param setX - the X coordinate for the stack that they are trying to drop a tile in
     * @return true if the move succeeds, false on error
     */
    public boolean setBoardAt(Player player, int setX) {
        return true;
    }

    /**
     * Get the player at a specific board position.
     * Should return null if the board position is invalid, if the game has not started, or if nobody has played yet at that position.
     * Otherwise returns the player whose tile is at that position.
     * @param getX - the X coordinate to get the player at
     * @param getY - the Y coordinate to get the player at
     * @return the player whose tile is at that position, or null if nobody has played at that position
     */
    public Player getBoardAt(int getX, int getY) {
        return null;
    }

    /**
     * Return a copy of the board.
     * Once the width and height are set, this function should not return null. Until then, it should return null.
     * Note that this function should not expose the private board instance variable.
     * Any changes to the board or players returned should not affect the state maintained by the class.
     * @return a copy of the current board
     */
    public Player[][] getBoard() {
        return null;
    }

    /**
     * Return the winner of the game, or null if the game has not ended.
     * @return the winner of the game, or null if the game has not ended
     */
    public Player getWinner() {
        return null;
    }

    /**
     * Class method to create a new ConnectN board.
     * Unlike the class constructor, static methods can return null on failure. Sometimes these methods are referred to as static factory methods.
     * This method should return null if its arguments are invalid. Otherwise, it should return a new ConnectN instance.
     * @param width - the width of the new ConnectN instance to create
     * @param height - the height of the new ConnectN instance to create
     * @param n - the n value of the new ConnectN instance to create
     * @return the new ConnectN instance, or null if the parameters are invalid
     */
    public static ConnectN create(int width, int height, int n) {
        return null;
    }

    /**
     * Creates multiple new ConnectN instances.
     * Like create(), createMany should return null if the parameters are invalid. Otherwise, it should return an array of newly-created ConnectN instances.
     * @param number - the number of new ConnectN instances to create
     * @param width - the width of the new ConnectN instance to create
     * @param height - the height of the new ConnectN instance to create
     * @param n - the n value of the new ConnectN instance to create
     * @return an array of new ConnectN instances, or null if the parameters are invalid
     */
    public static ConnectN[] createMany(int number, int width, int height, int n) {
        return null;
    }

    /**
     * Compare two ConnectN boards.
     * This method should compare two ConnectN boards. Two boards are equal if:
     * they have the same dimensions
     * they have the same n value
     * they have tiles by the same players in the same position
     * You can use the Player.equals method to compare two players.
     * @param firstBoard - the first ConnectN board to compare
     * @param secondBoard - the second ConnectN board to compare
     * @return true if the boards are the same, false otherwise
     */
    public static boolean compareBoards(ConnectN firstBoard, ConnectN secondBoard) {
        return true;
    }

    /**
     * Compare any number of ConnectN boards.
     * This methods takes a variadic number of arguments. It should return true if all the boards are the same.
     * See the notes on compareBoards(first, second) for a definition of board equality.
     * @param boards - the array of ConnectN boards to compare
     * @return true if all passed boards are the same, false otherwise
     */
    public static boolean compareBoards(ConnectN... boards) {
        return true;
    }
}
