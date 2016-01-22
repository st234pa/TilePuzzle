import java.util.*;
import wheels.users.*;
import java.awt.Color;
import java.awt.event.*;
public abstract class Button extends Image {
    private int _x;
    private int _y;
    protected PuzzleBoard _owner;
    protected Puzzle _puzzle;
    public Button(String n, int x, int y, PuzzleBoard b, Puzzle p) {
        super("images/" + n + ".jpg");
        _x = x;
        _y = y;
        _owner = b;
        _puzzle = p;
    }
    public abstract void mouseClicked(MouseEvent e);
}