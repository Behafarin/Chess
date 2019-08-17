package chessproject.Models;

import chess.FXMLDocumentController;
import static chess.FXMLDocumentController.turn;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class King extends Piece {

    public boolean hasChecked = false;

    public King(int i, int j, Player owner, ImageView image, House house) {
        super(i, j, owner, image, house);
        this.index = 5;
    }

    @Override
    public boolean Move(House origin, House destination) {
        if (destination.piece == null && ((Math.abs(destination.i - origin.i) == 1 && Math.abs(destination.j - origin.j) == 0)||(Math.abs(destination.i - origin.i) == 0 && Math.abs(destination.j - origin.j) == 1)||
                (Math.abs(destination.i - origin.i) == 1 && Math.abs(destination.j - origin.j) == 1))) {

            return true;
        } else if ((destination.piece != null && destination.piece.index!=5 && destination.piece.owner != FXMLDocumentController.players[turn%2]&&((Math.abs(destination.i - origin.i) == 1 && Math.abs(destination.j - origin.j) == 0)||(Math.abs(destination.i - origin.i) == 0 && Math.abs(destination.j - origin.j) == 1)
                ||(Math.abs(destination.i - origin.i) == 1 && Math.abs(destination.j - origin.j) == 1)))) {
            return true;
        } else {
            return false;
        }

    }

}