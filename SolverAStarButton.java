import java.util.*;
import wheels.users.*;
import java.awt.Color;
import java.awt.event.*;

public class SolverAStarButton extends Button {
    
    //pre: none
    //post: creates button, sets image to /images/SolverA.png, sets location, sets _owner to b, sets _puzzle to p
    //big O: O(1)
    public SolverAStarButton(PuzzleBoard b, Puzzle p) {
        super("SolverA", 100, 30, b, p);
    }
    
    //pre: mouse clicked Solver2Button
    //post: puzzle solved using PuzzleAStarSolver
    //Big O: O() because solve() is O() and everything else is O()
    public void mouseClicked(MouseEvent e) {
        PuzzleSolvers s = new PuzzleAStarSolver(_puzzle);
        if (s.solve()) {
            System.out.println(s.moves());
            s.play(_owner);
        }
    }
}