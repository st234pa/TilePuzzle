import wheels.users.*;
import java.awt.event.*;

public class PuzzleTile extends Image {

    private PuzzleBoard _owner; // a puzzle board
    public int _n; // the number on the tile

    public PuzzleTile(PuzzleBoard owner, int n) {
        super("images/Tile_"+n+".jpg");
		_owner = owner;
		_n = n;
    }

    public void mouseClicked(MouseEvent e) {
        _owner.tileClicked(_n); // when i click on the image, it calls the board tile clicked with the number
    }
}
