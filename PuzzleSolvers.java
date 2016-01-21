public abstract class PuzzleSolvers {

    protected Puzzle _puzzle;  // save a puzzle we are trying to solve
    
    protected int _count; // counts the number of moves needed to solve the puzzle
    protected String _moves; // a string of the positions that we move into the empty space, separated by 2 dotsPuz
    
    // constructor
    public PuzzleSolvers(Puzzle p) {
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
    }
        // returns the string with the moves
        // we won't really used this
        // it's mainly for display/debugging
    
     // pre condition: the tiles are shuffled and the user is going to click on tiles
    // post condition: the user has clicked on a tile to move
    // bigO notation: O(N^2)
    public void play(PuzzlePlayer player) {
        for (int i = 0 ; i<_moves.length(); i+=2){
            int n = Integer.parseInt(_moves.substring(i,i+1));
            player.puzzleMove(n);
        }
    }
    
    public abstract boolean solve();
    
}
