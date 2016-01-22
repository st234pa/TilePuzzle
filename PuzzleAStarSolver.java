import java.util.PriorityQueue;

public class PuzzleAStarSolver extends PuzzleSolvers {

    class PuzzleAStarSolverState implements Comparable<PuzzleAStarSolverState> {
        private final Puzzle _puzzle;
        private final int _count;
        private final int _distance;
        private final String _moves;

        PuzzleAStarSolverState(Puzzle puzzle, int count, String moves) {
            _puzzle = puzzle;
            _count = count;
            _moves = moves;
            _distance = _count + puzzle.distance();
        }

        public int compareTo(PuzzleAStarSolverState other) {
            return _distance - other._distance;
        }

    }

    // pre condition: 
    // post condition: saves _puzzle into the variable p, which is a Puzzle
    // bigO notation: O(1)
    public PuzzleAStarSolver(Puzzle p) {
        super(p);
    }

    // pre condition:
    // post condition: 
    // bigO notation: 
    public boolean solve() {

        PriorityQueue<PuzzleAStarSolverState> queue = new PriorityQueue<PuzzleAStarSolverState>();
        queue.add(new PuzzleAStarSolverState(_puzzle, 0, ""));

        while ((_count == 0) && (!queue.isEmpty())) { // we have not found solution yet and the queue isn't empty
            PuzzleAStarSolverState current = queue.poll(); // takes the first state out of the queue 

            if (current._puzzle.isSolved()) { //puzzle is solved
                _count = current._count;
                _moves = current._moves;
            }
            else {

                Puzzle p;
                int c = current._count +1;
                String m = current._moves;

                // move from the top
                p = new Puzzle(current._puzzle);
                if (p.move(-1, 0))
                    queue.add(new PuzzleAStarSolverState(p, c, m+p.emptyPos()+":"));

                // move from the right
                p = new Puzzle(current._puzzle);
                if (p.move(0, 1))
                    queue.add(new PuzzleAStarSolverState(p, c, m+p.emptyPos()+":"));

                // move from the bottom
                p = new Puzzle(current._puzzle);
                if (p.move(1, 0))
                    queue.add(new PuzzleAStarSolverState(p, c, m+p.emptyPos()+":"));

                // move from the left
                p = new Puzzle(current._puzzle);
                if (p.move(0, -1))
                    queue.add(new PuzzleAStarSolverState(p, c, m+p.emptyPos()+":"));
            }
        }
        
        return _count != 0; // we have a solution
    }

    
}
