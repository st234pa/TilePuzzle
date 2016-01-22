import java.util.*;
import wheels.users.*;
import java.awt.Color;
import java.awt.event.*;
public class SolverAStarButton extends Button {
    public SolverAStarButton(PuzzleBoard b, Puzzle p) {
        super("SolverA", 100, 30, b, p);
    }
    public void mouseClicked(MouseEvent e) {
        PuzzleSolvers s = new PuzzleAStarSolver(_puzzle);
        if (s.solve()) {
            System.out.println(s.moves());
            s.play(_owner);
        }
    }
}