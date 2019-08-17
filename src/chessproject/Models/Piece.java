package chessproject.Models;

import chess.FXMLDocumentController;
import static chess.FXMLDocumentController.moves;
import static chess.FXMLDocumentController.turn;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Piece {

    public enum color {
        white, black
    };
    public int i, j;
    public boolean isChosen = false;
    public boolean isExists = true;
    public int index;
    public boolean isAchsen = false;
    public ImageView image;
    public Player owner;
    public House house;

    public Piece(int i, int j, Player owner, ImageView image, House house) {
        this.i = i;
        this.j = j;
        this.owner = owner;
        this.image = image;
        this.house = house;
    }

    public abstract boolean Move(House origin, House destination);

    public void replace(House origin, House destination) {
        Image image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[origin.piece.index][FXMLDocumentController.turn % 2][destination.color]));
        destination.imageView.setImage(image);
        origin.imageView.setImage(null);
        if(destination.piece!=null)
        {
            if (FXMLDocumentController.turn % 2 == 1) {

                FXMLDocumentController.player1_pieces.remove(destination.piece);

            } else {

                FXMLDocumentController.player2_pieces.remove(destination.piece);

            }
        }
        FXMLDocumentController.players[turn % 2].ChosenPiece = null;
        this.i = destination.i;
        this.j = destination.j;
        this.isChosen = false;
        Move move =new Move(origin,destination,destination.piece);
        moves.add(move);
        this.house = destination;
        destination.piece = origin.piece;
        origin.piece = null;
        turn++;
    }

}