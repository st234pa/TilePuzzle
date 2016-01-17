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
		for (int i = 0; k = 1; i < size(); i++) {
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

	}

	public int size() {
		return _puzzle.length;
	}

	public boolean move(int dr, int dc) {

	}

	public void shuffle(int count) {

	}
}
