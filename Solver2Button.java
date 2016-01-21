import java.util.*;
import wheels.users.*;
import java.awt.Color;
import java.awt.event.*;
public class Solver2Button extends Button {
    public Solver2Button(PuzzleBoard b, Puzzle p) {
        super("Solver2", 35, 35, b, p);
    }
    public void mouseClicked(MouseEvent e) {
        PuzzleSolvers s = new PuzzleSolver2(_puzzle);
        if (s.solve()) {
            System.out.println(s.moves());
            s.play(_owner);
        }
    }
}