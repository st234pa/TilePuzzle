import java.util.PriorityQueue;

public class PuzzleAStarSolver extends PuzzleSolvers {

    class PuzzleAStarSolverState implements Comparable<PuzzleAStarSolverState> {
        private final PuzzleAStarSolverState _parent;
        private final Puzzle _puzzle;
        private final int _count;
        private final int _distance;
        private final String _moves;

        PuzzleAStarSolverState(PuzzleAStarSolverState parent, Puzzle puzzle, int count, String moves) {
            _parent = parent;
            _puzzle = puzzle;
            _count = count;
            _moves = moves;
            _distance = _count + puzzle.distance();
        }

        public int compareTo(PuzzleAStarSolverState other) {
            return _distance - other._distance;
        }

        public boolean alreadyIn(Puzzle p) {
            PuzzleAStarSolverState current = this;
            while (current != null) {
                if (current._puzzle.equals(p))
                    return true;
                else 
                    current = current._parent;
            }
            return false;
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
        queue.add(new PuzzleAStarSolverState(null, _puzzle, 0, ""));

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
                if (p.move(-1, 0) && !current.alreadyIn(p))
                    queue.add(new PuzzleAStarSolverState(current, p, c, m+p.emptyPos()+":"));

                // move from the right
                p = new Puzzle(current._puzzle);
                if (p.move(0, 1) && !current.alreadyIn(p))
                    queue.add(new PuzzleAStarSolverState(current, p, c, m+p.emptyPos()+":"));

                // move from the bottom
                p = new Puzzle(current._puzzle);
                if (p.move(1, 0) && !current.alreadyIn(p))
                    queue.add(new PuzzleAStarSolverState(current, p, c, m+p.emptyPos()+":"));

                // move from the left
                p = new Puzzle(current._puzzle);
                if (p.move(0, -1) && !current.alreadyIn(p))
                    queue.add(new PuzzleAStarSolverState(current, p, c, m+p.emptyPos()+":"));
            }
        }
        
        return _count != 0; // we have a solution
    }

    
}
