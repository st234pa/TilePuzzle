public class PuzzleSolver2 extends PuzzleSolvers{

    // pre condition: 
    // post condition: saves _puzzle into the variable p, which is a Puzzle
    // bigO notation: O(1)
    public PuzzleSolver2(Puzzle p) {
        super(p);
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
        return false;
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
        return false;
    }
    
}