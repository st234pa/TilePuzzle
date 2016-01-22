import java.util.*;
import wheels.users.*;
import java.awt.Color;
import java.awt.event.*;
public class Solver2Button extends Button {
    
    //pre: none
    //post: creates button visual
    //Big O: O(1)
    public Solver2Button(PuzzleBoard b, Puzzle p) {
        super("Solver2", 35, 35, b, p);
    }
    
    //pre: mouse clicked
    //post: puzzle solved
    //Big O: O(N^3)
    public void mouseClicked(MouseEvent e) {
        PuzzleSolvers s = new PuzzleSolver2(_puzzle);
        if (s.solve()) {
            System.out.println(s.moves());
            s.play(_owner);
        }
    }
}
