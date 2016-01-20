public class PuzzleSolver1 extends PuzzleSolvers{
// USES BFS ALGO --> finds all paths
// O(N^3) think of travel optimization problems!

    // pre condition: _puzzle needs to exist
    // post condition: saves _puzzle into the variable p, which is a Puzzle
    // bigO notation: O(1)
    public PuzzleSolver1(Puzzle p) {
        _puzzle = p;
    }

    // GO OVER THE SOLVERS
    // pre condition:
    // post condition: 
    // bigO notation: 
    public boolean solve() {
        _count = 0; // clears the counts
        _moves = "";// clears moves
        //  WHAT IS -1 FOR?
        solve(_count,_count - 1 , _moves); //recursive private solve function with solve(0, -1, "")
        if (_count != 0) return true;// return true if count is not null (we found something!)
        return false;// return false otherwise
    }


    //WE NEED TO GO OVER THIS BECAUSE IT IS SORT OF CONFUSING
    // pre condition:
    // post condition:
    // bigO notation: 
    private boolean solve(int count, int last, String stack) { // variable last: 0 means moved tile on top, 1 moved the tile on the right, 2 means moved tile below, and 3 means moved tile on the left
        if (_puzzle.isSolved()) return true;// check if the puzzle is solved
        if (_count == 0 || _count > count){
            _count = count;
            _moves = stack;
            return true;
        } // if current _count is null or greater than count, then we have a better solution, so save this count into _count and stack into _moves and return true
        _count ++; 
        if (_count > 31) return false;// check that the count is not greater than the count max (which is 31 for a 3x3 board)
        // and check that ??????????
        return false;

    }

    
}
