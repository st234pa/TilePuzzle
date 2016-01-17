//class Puzzle, text representation

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
		int k = 0;
		for (int i = 0; i < size(); i++) {
			for (int j = 0; j < size(); j++) {
				_puzzle[i][j] = k;
				k++;
			}
		}
		_emptyCellRow = _puzzle.length - 1;
		_emptyCellColumn = _puzzle.length - 1;
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
	//post:
	//O(1)
	public int emptyRow() {
		return _emptyCellRow;
	}

	//pre:
	//post:
	//O(1)
	public int emptyColumn() {
		return _emptyCellColumn;
	}

	//pre:
	//post:
	//O(1)
	public int emptyPos() {
		return _emptyCellRow * size() + _emptyCellColumn;
	}

	//pre:
	//post:
	//O(1)
	public int at(int r, int c) {
		return _puzzle[r][c];
	}

	//pre:
	//post:
	//O(n^2)
	public int pos(int n) {
		for (int i = 0; i < size(); i++) {
			for (int j = 0; j < size(); j++) {
				if (at(i, j) == n)
					return i * size() + j;
			}
		}
	}

	//pre:
	//post:
	//O(1)
	public int posRow(int p) {
		return p / _puzzle.length;
	}

	//pre:
	//post:
	//O(1)
	public int posCol(int p) {
		return p % _puzzle.length;
	}

	//pre:
	//post:
	//O(n^2)
	public void print() {
		for (int i = 0; i < size(); i++) {
			for (int j = 0; j < size(); j++) {
				System.out.print("[ " + at(i, j) + "] ");
			}
			System.out.println();
		}
	}

	//pre:
	//post:
	//O(1)
	public int size() {
		return _puzzle.length;
	}

	//pre:
	//post:
	//O(n)
	public void shuffle(int count) { // count is the number of random moves to make
		for (int i = 0; i < count; i++) {
			int k = (int)(Math.random() * 4)
			if (k = 0)
				move(-1, 0); //move up
			else if (k = 1)
				move(1, 0); //move down
			else if (k = 2)
				move(0, -1); //move left
			else if (k = 3)
				move(0, 1); //move right
		}
	}

	//pre:
	//post:
	//O(1)
	public boolean move(int dr, int dc) { //dr and dc would refer to the relative position of the tile that we want to move.
		int newRow = emptyRow() + dr;
		int newCol = emptyRow() + dc;
		if ((newRow >= 0 && newRow < size()) && (newCol >=0 && newCol < size()) { //checks to see that the tile we want to move is on the board
			//now switch the tile and the empty tile
			_puzzle[emptyRow()][emptyColumn()] = _puzzle[newRow][newCol]);
			_puzzle[newRow][newCol] = 0;
			_emptyCellRow = newRow;
			_emptyCellColumn = newCol;
			return true;
		}
		return false;
	}
}
