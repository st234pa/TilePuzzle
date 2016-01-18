public interface PuzzlePlayer {
	// pre condition: puzzle tiles are not solved
    // post condition: puzzle tiles are not necessarily solved, but one tile switched places with the blank space
    // bigO notation: WHERE IS THIS DEFINED?
    public void puzzleMove(int pos);
}
