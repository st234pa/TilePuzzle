public class PuzzleSolver {

    private Puzzle _puzzle; // save a puzzle we are trying to solve

    private int _count; // counts the number of moves needed to solve the puzzle
    private String _moves; // a string of the positions that we move into the empty space, separated by 2 dots

    // pre condition: _puzzle needs to exist
    // post condition: saves _puzzle into the variable p, which is a Puzzle
    // bigO notation: O(1)
    public PuzzleSolver(Puzzle p) {
        _puzzle = p;
    }

    // pre condition: _count needs to exist
    // post condition: the private int _count is returned
    // bigO notation: O(1)
    public int count() {
        return _count;
    }

    // pre condition: _moves needs to exist
    // post condition: the private int _moves is returned
    // bigO notation: O(1) 
    public String moves() {
        return _moves;
        // returns the string with the moves
        // we won't really used this
        // it's mainly for display/debugging 
    }

    //WE NEED TO GO OVER THIS BECAUSE IT IS SORT OF CONFUSING
    // pre condition:
    // post condition:
    // bigO notation: 
    private boolean solve(int count, int last, String stack) { // variable last: 0 means moved tile on top, 1 moved the tile on the right, 2 means moved tile below, and 3 means moved tile on the left
        // check if the puzzle is solved
        // if current _count is null or greater than count, then we have a better solution, so save this count into _count and stack into _moves and return true
        // then increment the count
        // check that the count is not greater than the count max (which is 31 for a 3x3 board)
        // and check that 

    }

    // GO OVER THE SOLVERS
    // pre condition:
    // post condition: 
    // bigO notation:  
    public boolean solve() {
        // clears the counts
        // clears moves
        // use recursive private solve function with solve(0, -1, "")
        // return true if count is not null (we found something!)
        // return false otherwise
    }
    
    // pre condition: the tiles are shuffled and the user is going to click on tiles
    // post condition: the user has clicked on a tile to move
    // bigO notation: O(N^2) 
    public void play(PuzzlePlayer player) {
        // loops on the _moves and calls the player's puzzle move function for each of the moves

}