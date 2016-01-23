import java.util.*;
import wheels.users.*;
import java.awt.Color;
import java.awt.event.*;
public class Solver2Button extends Button {
    
    //pre: none
    //post: creates button, sets image to /images/Solver2.png, sets location, sets _owner to b, sets _puzzle to p
    //Big O: O(1)
    public Solver2Button(PuzzleBoard b, Puzzle p) {
        super("Solver2", 170, 30, b, p);
    }
    
    //pre: mouse clicked Solver2Button
    //post: puzzle solved using PuzzleSolver2 
    //Big O: O(N^3) because solve() is O(n^3) and everything else is O(1)
    public void mouseClicked(MouseEvent e) {
        PuzzleSolvers s = new PuzzleSolver2(_puzzle);
        if (s.solve()) {
            System.out.println(s.moves());
            s.play(_owner);
        }
    }
}
