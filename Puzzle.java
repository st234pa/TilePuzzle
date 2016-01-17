//class Puzzle, text representation

public class Puzzle {
	private int[][] _puzzle;
	private int _emptyCellRow;
	private int _emptyCellColumn;

	public TilePuzzle(int size) {
		_puzzle = new int[size][size];
		reset();
	}

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

	public boolean isSolved() {
		for (int i = 0, k = 1; i < size(); i++) {
			for (int j = 0; j < size(); j++, k++)
				if (_puzzle[i][j] != 0 && (_puzzle[i][j] != k))
					return false;
		}
		return true;
	}

	public int emptyRow() {
		return _emptyCellRow;
	}

	public int emptyColumn() {
		return _emptyCellColumn;
	}

	public emptyPos() {
		return _emptyCellRow * size() + _emptyCellColumn;
	}

	public int at(int r, int c) {
		return _puzzle[r][c];
	}

	public pos(int n) {
		for (int i = 0; i < size(); i++) {
			for (int j = 0; j < size(); j++) {
				if (at(i, j) == n)
					return i * size() + j;
			}
		}
	}

	public int posRow(int p) {
		return p / _puzzle.length;
	}

	public int posCol(int p) {
		return p % _puzzle.length;
	}

	public void print() {
		for (int i = 0; i < size(); i++) {
			for (int j = 0; j < size(); j++) {
				System.out.print("[ " + at(i, j) + "] ");
			}
			System.out.println();
		}
	}

	public int size() {
		return _puzzle.length;
	}

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
}
