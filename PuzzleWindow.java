import wheels.users.*;
import java.util.*;

public class PuzzleWindow extends Frame{

    // pre condition: this is the driver class, so there is no preconditon
    // post condition: makes a new frame and new board and sets board to a given position
    // bigO notation: O(1) 
    public PuzzleWindow(){
        super(); // creates the frame
        PuzzleBoard board = new PuzzleBoard(3); // creates a puzzle board of size 3
        board.setLocation(250,150); // sets location of the board to (100, 100)
    }

    // pre condition: there is no precondition
    // post condition: makes a new puzzle window
    // bigO notation: O(1)
    public static void main(String[] args) {
        PuzzleWindow p = new PuzzleWindow();// creates a new puzzle window
    }

}
