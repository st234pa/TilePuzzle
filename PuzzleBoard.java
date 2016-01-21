import java.util.*;
import wheels.users.*;
import java.awt.Color;
import java.awt.event.*;

public class PuzzleBoard extends Rectangle implements PuzzlePlayer {

    private ArrayList<PuzzleTile> _tiles;
        
    private Puzzle _puzzle;
    
    public Puzzle getPuzzle() {
        return _puzzle;
    }
    
    // pre condition: the frame has been created
    // post condition: a board (puzzle) is created and added onto the frame
    //                 a tile arraylist is created  and shuffled
    // bigO notation: O(N) because we are using a for loop to go through    
    public PuzzleBoard(int n) {
		super(Color.GRAY);
	
		//Puzzle creation, 1000 shuffles
		_puzzle = new Puzzle(n);
		//_puzzle.shuffle(1000);
        // idea: should have a shuffle button and a solve button!!

		_tiles = new ArrayList<PuzzleTile>();
		for (int i = 0;i < ( n*n -1); i++)
			_tiles.add(new PuzzleTile(this,i+1));
            
		placeTiles();

		this.setSize(_tiles.get(0).getWidth() * n, _tiles.get(0).getHeight() *n); //sets the board size for the tiles
    }
    
    public void placeTiles() {
		if (_puzzle == null) 
            return;  // for overloading
		placeTiles(1);
    }

    // pre condition: a puzzle board has been created and the tile arraylist has been created and shuffled
    // post condition: the shuffled tiles from the arraylist are placed onto the board 
    // bigO notation: O(N^2) 
	private void placeTiles(int n){
		int x = getXLocation();
		int y = getYLocation();
        int p = _puzzle.pos(n);
        int pr = _puzzle.posRow(p);
        int pc = _puzzle.posCol(p);
        PuzzleTile t = _tiles.get(n-1);

		t.setLocation(x + (pc*t.getWidth()), y + (pr*t.getHeight()));
		if (n < _tiles.size()) 
            placeTiles(n +1);
	}

    // pre condition: we have all of the tiles and the locations needed to actually place the tiles
    // post condition: tiles are placed at the position (x,y)
    // bigO notation: O(N^2)  
    public void setLocation (int x, int y) {
        //use the super of set location and then place the tiles at (x,y)
        super.setLocation(x,y);
        placeTiles();
    }
      
    // pre condition: we want to move a tile
    //                we can only move in one direction (either the row changes OR the column changes, but not both)
    // post condition: the postion of the tile is changed and all of the tiles are replaced on the board
    // bigO notation: O(N^2)  
    public void slide(int p) {
        // get the row of the position p
        // subtract the row of the empty space
        // get the column of the position p
        // subtract the column of the empty space 
        // call move    
        int dr = _puzzle.posRow(p) - _puzzle.emptyRow(); //position relative to the empty cell
        int dc = _puzzle.posCol(p) - _puzzle.emptyColumn(); 

        //have to check that the move is possible: (0, 1), (0, -1), (-1, 0), (1, 0).
        if (((Math.abs(dr) == 1) && (dc == 0)) || ((Math.abs(dc) == 1) && (dr == 0))) {
           _puzzle.move(dr, dc); //updates the 2d array
            placeTiles(); //updates the visuals
        }    
    }
    
    // pre condition: the tile we want to move has been clicked
    // post condition: the tile clicked is moved to the empty space 
    // bigO notation: O(N^2)    
    public void tileClicked(int n) {
        // asks the puzzle for the position of n
        // slide(n)
        int pos = _puzzle.pos(n);
        slide(pos);
    }
    
    // pre condition: the empty (gray) cell is clicked
    // post condition: new puzzle solver is created (so, we find the most efficient solution) and then we actually play the solution
    // bigO notation: O(1)     
    /*public void mouseClicked(MouseEvent e) { //this gets called when the user clicks the empty cell (gray) which is really just the board
        // creates a puzzle solver for that _puzzle
        //PuzzleSolvers solver = new PuzzleSolver1(_puzzle); 
        PuzzleSolvers solver = new PuzzleSolver2(_puzzle); 
        // solve and check the result
        if (solver.solve()) { 
            // if it is solved, ask the solver to play using "this" as the player
            System.out.println(solver.moves());
            solver.play(this);
        }
    }*/

    // pre condition: 
    // post condition:
    // bigO notation:         
    public void puzzleMove(int pos) {
        // this is called by the player to play every move
        slide(pos);
        try {
            _dp.paintImmediately(_dp.getBounds());
            Thread.sleep(200);
        } 
        catch (Exception e) {
        }
    }
}
