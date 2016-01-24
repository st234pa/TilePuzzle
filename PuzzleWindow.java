import wheels.users.*;
import java.util.*;

public class PuzzleWindow extends Frame{

    // pre condition: this is the driver class, so there is no preconditon
    // post condition: makes a new frame and new board and sets board to a given position
    // bigO notation: O(1) 
    public PuzzleWindow(String mode){
        super(); // creates the frame
        PuzzleBoard board = new PuzzleBoard(3, mode); // creates a puzzle board of size 3
        board.setLocation(250,150); // sets location of the board to (100, 100)
        Button shufflebutton = new ShuffleButton(board, board.getPuzzle());
        Button solver2button = new Solver2Button(board, board.getPuzzle());
        Button solverastarbutton = new SolverAStarButton(board, board.getPuzzle());
    }

    // pre condition: there is no precondition
    // post condition: makes a new puzzle window
    // bigO notation: O(1)
    public static void main(String[] args) {
        System.out.println("TILE PUZZLE GAME -- by Stephanie Yoon, Chloe Delfau, and Anya Keller");
        System.out.println("This is a GUI based game. To shuffle the tiles, click the shuffle icon at the top left corner. To move a tile that is adjacent to the empty cell, click it. If you give up, click one of the two key icons at the top. This will solve the puzzle for you! Do you want to play? (y/n): ");
        Scanner scan = new Scanner(System.in);
        String ans = scan.nextLine();
        if (ans.equals("y")) {
            System.out.println("Do you want to play in number mode or Platek mode? (n/p): ");
            mode = scan.nextLine();
            PuzzleWindow p = new PuzzleWindow(mode);// creates a new puzzle window
        }
    }

}
