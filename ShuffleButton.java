import java.util.*;
import wheels.users.*;
import java.awt.Color;
import java.awt.event.*;
public class ShuffleButton extends Button {
    
    //pre: none
    //post: creates button, sets image to /images/ShuffleButton.png, sets location, sets _owner to b, sets _puzzle to p
    //big O: O(1)
    public ShuffleButton(PuzzleBoard b, Puzzle p) {
        super("ShuffleButton", 30, 30, b, p); //these numbers are random, change to whatever
    }
    
    //pre: mouse is clicked on ShuffleButton
    //post: _puzzle is shuffled, puzzleboard updated
    //big O: O(N^2+N) 
    public void mouseClicked(MouseEvent e) {
        _puzzle.shuffle(1000);
        _owner.placeTiles();
    }
}