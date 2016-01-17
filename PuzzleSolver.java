public class PuzzleSolver {

    private Puzzle _puzzle; // save a puzzle we are trying to solve

    private int _count; // counts the number of moves needed to solve the puzzle
    private String _moves; // a string of the positions that we move into the empty space, separated by 2 dots


    public PuzzleSolver(Puzzle p) {
        // stores the puzzle
    }

    public int count() {
        // returns the number of moves (Hint: _count)
    }

    public String moves() {
        // returns the string with the moves
        // we won't really used this
        // it's mainly for display/debugging 
    }

    private boolean solve(int count, int last, String stack) { // variable last: 0 means moved tile on top, 1 moved the tile on the right, 2 means moved tile below, and 3 means moved tile on the left
        // check if the puzzle is solved
        // if current _count is null or greater than count, then we have a better solution, so save this count into _count and stack into _moves and return true
        // then increment the count
        // check that the count is not greater than the count max (which is 31 for a 3x3 board)
        // and check that 

    }

    public boolean solve() {
        // clears the counts
        // clears moves
        // use recursive private solve function with solve(0, -1, "")
        // return true if count is not null (we found something!)
        // return false otherwise
    }

    public void play(PuzzlePlayer player) {
        // loops on the _moves and calls the player's puzzle move function for each of the moves

}