public interface PuzzlePlayer {
	// pre condition: puzzle tiles are not solved
    // post condition: puzzle tiles are not necessarily solved, but one tile switched places with the blank space
    // bigO notation: defined in classes that implement PuzzzlePlayer
    public void puzzleMove(int pos);
    // the player wiill be called for each move
}
