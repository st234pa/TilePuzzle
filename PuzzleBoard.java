
import java.util.*;
import wheels.users.*;
import java.awt.Color;
import java.awt.event.*;

public class PuzzleBoard extends Rectangle implements PuzzlePlayer {

        private ArrayList<PuzzleTile> _tiles;
        
        private Puzzle _puzzle;
        
        public PuzzleBoard(int n) {
			super(Color.gray);
	
			//Puzzle creation, 1000 shuffles
			_puzzle = new Puzzle(n);
			_puzzle.shuffle(1000);

			_tiles = new ArrayList<PuzzleTile>();
			for (int i = 0;i < ( n*n -1); i++)
				_tiles.add(new PuzzleTile(this,i+1));
            
			placeTiles();

			this.setSize(_tiles.get(0).getWidth() * n, _tiles.get(0).getHeight() *n); //sets the board size for the tiles
        }
        
        public void placeTiles() {
			if (_puzzle == null) return;  //for overloading
			
			placeTiles(1);
		}
		public void placeTiles(int n){
			int x = getXLocation();
			int y = getYLocation();
			_tiles.get(n-1).setLocation(x + ((n-1)%_puzzle.size())*(_tiles.get(n-1)).getWidth(), y + ((n-1)/_puzzle.size())*(_tiles.get(n-1)).getHeight());
			if (n < _tiles.size()) placeTiles(n +1);
		}

        public void setLocation (int x, int y) {
            //use the super of set location and then place the tiles at (x,y)
            super.setLocation(x,y);
            placeTiles();
        }
        
        public void tileClicked(int n) {
            // asks the puzzle for the position of n
            // slide(n)
            int pos = _puzzle.pos(n);
            slide(p);
        }
        
        public void slide(int p) {
            // get the row of the position p
            // subtract the row of the empty space
            // get the column of the position p
            // subtract the column of the empty space 
            // call move           
        }
        
        public void mouseClicked(MouseEvent e) {
            // creates a puzzle solver for that _puzzle
            // solve and check the result
            // if it is solved, ask the solver to play using "this" as the player
        }
        
        public void puzzleMove(int pos) {
            // this is called by the player to play every move
            // call slide(pos)
            try {
                _dp.paintImmediately(_dp.getBounds());
                Thread.sleep(200);
            } 
            catch (Exception e) {
            }
        }
}
