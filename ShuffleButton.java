public class ShuffleButton extends Button {
    public ShuffleButton(PuzzleBoard b, Puzzle p) {
        super("ShuffleButton", 30, 30, b, p); //these numbers are random, change to whatever
    }
    public void mouseClicked(MouseEvent e) {
        _puzzle.shuffle(1000);
        _owner.placeTiles();
    }
}