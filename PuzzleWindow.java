import wheels.users.*;

public class PuzzleWindow extends Frame{

    public PuzzleWindow(){
        super();// creates the frame
        PuzzleBoard board = new PuzzleBoard(3);// creates a puzzle board of size 3
        board.setLocation(100,100);// sets location of the board to (100, 100)
    }

    public static void main(String[] args) {
        PuzzleWindow p = new PuzzleWindow();// creates a new puzzle window
    }

}
