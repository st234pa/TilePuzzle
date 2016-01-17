import java.util.*;
import wheels.users.*;
import java.awt.Color;
import java.awt.event.*;

public class PuzzleBoard extends Rectangle implements PuzzlePlayer {

        private ArrayList<PuzzleTile> _tiles;
        
        private Puzzle _puzzle;
        
        public PuzzleBoard(int n) {
            // for us n is 3, which is the size of the board
            // set color of the rectangle (use super because we extend rectangle)
            super();
            // create a puzzle
            // shuffle the puzzle (1000 times!)
            // create the _tiles and add them to the PuzzleTile
            // call placeTiles()
            // set the size of the board
        }
        
        public void placeTiles() {
            // test if _puzzle is null and return because we want to overload the function.... board extends rectangle and we want everything to move to the saem location when we call set location
            // get the x and y of the current object
            // loops on the puzzle
            // for each row, for each column
        }
        
        public void setLocation (int x, int y) {
            //use the super of set location and then place the tiles at (x,y)
        }
        
        public void tileClicked(int n) {
            // asks the puzzle for the position of n
            // slide(n)
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
