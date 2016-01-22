import java.util.*;
import wheels.users.*;
import java.awt.Color;
import java.awt.event.*;
public class ShuffleButton extends Button {
    
    //pre: none
    //post: constructs a button
    //big O: O(1)
    public ShuffleButton(PuzzleBoard b, Puzzle p) {
        super("ShuffleButton", 30, 30, b, p); //these numbers are random, change to whatever
    }
    
    //pre: none
    //post: board is shuffled
    //big O: O(N)
    public void mouseClicked(MouseEvent e) {
        _puzzle.shuffle(1000);
        _owner.placeTiles();
    }
}