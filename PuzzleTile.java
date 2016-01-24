import wheels.users.*;
import java.awt.event.*;

public class PuzzleTile extends Image {

    private PuzzleBoard _owner; // a puzzle board
    public int _n; // the number on the tile

    // pre condition: a puzzleboard already exists
    // post condition: tile is created, given a unique image and number and assigned to a board
    // bigO notation: O(1)
    public PuzzleTile(PuzzleBoard owner, int n, String mode) {
        super("images/" + mode + "/" + "Tile_" + n + ".jpg");
		_owner = owner;
		_n = n;
    }

    // pre condition: there wwas a mouse click on a tile
    // post condition: calls tileClicked from the board class, which exchanges the place of the tile with the empty cell
    // bigO notation: O(n^2)
    public void mouseClicked(MouseEvent e) {
        _owner.tileClicked(_n); // when i click on the image, it calls the board tile clicked with the number
    }
}
