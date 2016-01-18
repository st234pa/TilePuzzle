import wheels.users.*;
import java.util.*;

public class PuzzleWindow extends Frame{

    public PuzzleWindow(){
	// pre condition: this is the driver class, so there is no preconditon
    	// post condition: makes a new frame and new board and sets board to a given position
    	// bigO notation: O(1)
        super();// creates the frame
        PuzzleBoard board = new PuzzleBoard(3);// creates a puzzle board of size 3
        board.setLocation(500,200);// sets location of the board to (100, 100)
    }

    public static void main(String[] args) {
	// pre condition: there is no precondition
    	// post condition: makes a new puzzle window
    	// bigO notation: O(1)
        PuzzleWindow p = new PuzzleWindow();// creates a new puzzle window
    }

}
