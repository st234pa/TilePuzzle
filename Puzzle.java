//class Puzzle, text representation

//this is my comment
public class Puzzle {
	private int[][] _puzzle;
	private int _emptyCellRow;
	private int _emptyCellColumn;

	//pre: Size is > 1. For this project, size is always equal to 3 or 4.
	//post: _puzzle is set to a 2d array (square) with size rows and columns, and is reset.
	//O(n^2)
	public Puzzle(int size) {
		_puzzle = new int[size][size];
		reset();
	}

	//pre: _puzzle is a 2d array of size size().
	//post: _puzzle tiles are set in correct order as follows:
	/* (This is a puzzle of size 3.)
	1  2  3 
	4  5  6
	7  8  0
	*/
	//post(cont'd): where 0 represents the empty cell. _emptyCellRow and _emptyCell column are set to the row and column of the empty cell.
	//O(n^2)
	public void reset() {
		int k = 1;
		for (int i = 0; i < size(); i++) {
			for (int j = 0; j < size(); j++) {
				_puzzle[i][j] = k;
				k++;
			}
		}
		_emptyCellRow = size() - 1;
		_emptyCellColumn = size() - 1;
		_puzzle[_emptyCellRow][_emptyCellColumn] = 0;
	}

	//pre: elements of arrays in _puzzle are set to the values 0 to size-1. 
	//post: returns true if the elements of _puzzle are in numerical order (starting with 1) with the exception of 0, the empty cell.
	//O(n^2)
	public boolean isSolved() {
		for (int i = 0, k = 1; i < size(); i++) {
			for (int j = 0; j < size(); j++, k++)
				if (_puzzle[i][j] != 0 && (_puzzle[i][j] != k))
					return false;
		}
		return true;
	}

	//pre: 
	//post: Returns value of _emptyCellRow, the row of the element 0 in its current position.
	//O(1)
	public int emptyRow() {
		return _emptyCellRow;
	}

	//pre:
	//post: Returns value of _emptyCellColumn, the column of the element 0 in its current position.
	//O(1)
	public int emptyColumn() {
		return _emptyCellColumn;
	}

	//pre:
	//post: returns the position of the empty cell, calculated by the row multiplied by the size() + the column.
	//O(1)
	public int emptyPos() {
		return _emptyCellRow * size() + _emptyCellColumn;
	}

	//pre: 0 <= r < size(), 0 <= c < size(), so that the cell is on the board.
	//post: returns the value of the element at a given row and column.
	//O(1)
	public int at(int r, int c) {
		return _puzzle[r][c];
	}

	//pre: n is a value of a tile on the board, so 0 <= n < size().
	//post: returns the position of n on the board, calculated by the row multiplied by the size() + the column.
	//O(n^2)
	public int pos(int n) {
		for (int i = 0; i < size(); i++) {
			for (int j = 0; j < size(); j++) {
				if (at(i, j) == n)
					return i * size() + j;
			}
		}
		return -1;
	}

	//pre: p is a position on the board, calculated by row * size() + column
	//post: returns row of this position by dividing p by size() to get the quotient, row
	//O(1)
	public int posRow(int p) {
		return p / _puzzle.length;
	}

	//pre: p is a position on the board, calculated by row * size() + column
	//post: returns column of this position by dividing p by size() to get the quotient, column
	//O(1)
	public int posCol(int p) {
		return p % _puzzle.length;
	}

	//pre:
	//post: prints the values of the elements of _puzzle. rows separated by new lines.
	//O(n^2)
	public void print() {
		for (int i = 0; i < size(); i++) {
			for (int j = 0; j < size(); j++) {
				System.out.print("[ " + at(i, j) + "] ");
			}
			System.out.println();
		}
	}

	//pre: _puzzle is a square 2-d array
	//post: returns the size of the _puzzle, or the length of _puzzle.
	//O(1)
	public int size() {
		return _puzzle.length;
	}

	//pre: count > 0. _puzzle is set up.
	//post: moves random tiles count times. --> shuffled board.
	//O(n)
	public void shuffle(int count) { // count is the number of random moves to make
		for (int i = 0; i < count; i++) {
			int k = (int)(Math.random() * 4);
			if (k == 0)
				move(-1, 0); //move up
			else if (k == 1)
				move(1, 0); //move down
			else if (k == 2)
				move(0, -1); //move left
			else if (k == 3)
				move(0, 1); //move right
		}
	}

	//pre: dr and dc could have the following values: (-1, 0), (1, 0), (0, -1), (0, 1)
	//post: switches the tile above/below/left of /right of the empty cell with the empty cell. updates _emptyCellRow and _emptyCellColumn, updates values of elements.
	//O(1)
	public boolean move(int dr, int dc) { //dr and dc would refer to the relative position of the tile that we want to move.
		int newRow = emptyRow() + dr;
		int newCol = emptyColumn() + dc;
		if ((newRow >= 0) && (newRow < size()) && (newCol >=0) && (newCol < size())) { //checks to see that the tile we want to move is on the board
			//now switch the tile and the empty tile
			_puzzle[_emptyCellRow][_emptyCellColumn] = _puzzle[newRow][newCol];
			_puzzle[newRow][newCol] = 0;
			_emptyCellRow = newRow;
			_emptyCellColumn = newCol;
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
        Puzzle p = new Puzzle(3);
        
        p.print();
        System.out.println("isSorted="+p.isSolved());
        p.shuffle(2);
        p.print();
        System.out.println("isSorted="+p.isSolved());
        
        //p.solve(31, -1, "");

        /*PuzzleSolver1 s = new PuzzleSolver1(p);
        s.solve();
        System.out.println(""+s.count()+"="+s.moves());
        p.print();
        System.out.println("isSorted="+p.isSolved());
        */
    }
}
