//Button abstract superclass.

import java.util.*;
import wheels.users.*;
import java.awt.Color;
import java.awt.event.*;
public abstract class Button extends Image {
    
    //instance variables
    private int _x;
    private int _y;
    protected PuzzleBoard _owner;
    protected Puzzle _puzzle;
    
    
    //constructs a button abstract class
    // Pre: int x and int y are coordinates in the visual pane
    // Post: A string of text n, coordinate integers x and y, PuzzleBoard b, and Puzzle p are bound to their respective instance variables
    //Big O: O(1)  
    public Button(String n, int x, int y, PuzzleBoard b, Puzzle p) {
        super("images/" + n + ".png");
        _x = x;
        _y = y;
        _owner = b;
        _puzzle = p;
        setLocation(x,y);
    }
    
    // when the button is clicked --> will be difined in subclasses
    public abstract void mouseClicked(MouseEvent e);
}