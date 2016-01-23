public class PuzzleSolver2 extends PuzzleSolvers {

    // pre condition: we have puzzle p
    // post condition: saves _puzzle into the variable p, which is a Puzzle
    // bigO notation: O(1)
    public PuzzleSolver2(Puzzle p) {
        super(p);
    }

    // 31 moves MAX! for a 3x3 puzzle. the hardest puzzle to solve only needs 31 moves
    // pre condition: is called by the public solve() function
    // post condition: solves the board
    // bigO notation: O(N^3)
    private void solve(int count, int last, String moves) { 
    // variable last: 0 means moved tile on top, 1 moved the tile on the right, 2 means moved tile below, and 3 means moved tile on the left
        // check if the puzzle is solved
        if (_puzzle.isSolved()) {
            if ((_count == 0) || (count < _count)) { // tests if it is the first solution or more efficient than the previous found solution
                _count = count;
                _moves = moves;
            }
            return;
        }
        // then increment the count
        count++; 
        // tests that we do not exceed 31 levels of recursion
        // tests if our number of moves is greater than the best solution that we've found so far
        if ((count > 31) || (count > _count) && (_count != 0))
            return; 
        
        if ((last != 2) && (_puzzle.move(-1, 0))) { // move the tile on top into the empty space if the the previous move was not from the bottom
            solve(count, 0, moves + _puzzle.emptyPos() + ":"); // call recursively 
            _puzzle.move(1, 0); // move back the tile and then try another move
        }

        if ((last != 3) && (_puzzle.move(0, 1))) { // move the tile on the right into the empty space if the previous move was not from the left
            solve(count, 1, moves + _puzzle.emptyPos() + ":"); // call recursively 
            _puzzle.move(0, -1); // move back the tile and then try another move
        }

        if ((last != 0) && (_puzzle.move(1, 0))) { // move the tile under into the empty space if the previous move was not from the top
            solve(count, 2, moves + _puzzle.emptyPos() + ":"); // call recursively 
            _puzzle.move(-1, 0); // move back the tile and then try another move
        }

        if ((last != 1) && (_puzzle.move(0, -1))) { // move the tile on the let into the empty space if the previous step was not from the right
            solve(count, 3, moves + _puzzle.emptyPos() + ":"); // call recursively 
            _puzzle.move(0, 1); // move back the tile and then try another move
        }

    }

    // pre condition: board is not solved
    // post condition: board is solved
    // bigO notation: O(N^3) bc recursive
    public boolean solve() {
        // clears the counts
        _count = 0;
        // clears moves
        _moves = "";
        // use recursive private solve function 
        solve(_count, -1, _moves);
        // return true if count is not null (we found something!)
        if (_count > 0)
            return true;
        // return false otherwise
        return false; // if the puzzle was already solved, we return false since there is nothing to solve
    }
    
}