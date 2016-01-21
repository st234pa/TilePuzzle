public class PuzzleSolver1 extends PuzzleSolvers{
// USES BFS ALGO --> finds all paths
// O(N^3) think of travel optimization problems!

    // pre condition: 
    // post condition: saves _puzzle into the variable p, which is a Puzzle
    // bigO notation: O(1)
    public PuzzleSolver1(Puzzle p) {
        super(p);
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
    private boolean solve(int count, int last, String stack) { 

    }

    
}
