package chessproject.Models;

import chess.FXMLDocumentController;
import static chess.FXMLDocumentController.turn;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Rock extends Piece {

    public int initial = 1;

    public Rock(int i, int j, Player owner, ImageView image, House house) {
        super(i, j, owner, image, house);
        this.index = 3;
    }

    @Override
    public void Move(House origin, House destination) {
        if (destination.piece != null && destination.piece.owner == FXMLDocumentController.players[FXMLDocumentController.turn % 2]) {
            return;
        }
        if (destination == origin) {
            return;
        }
        System.out.println("ROCK");
        if (destination.i == origin.i) {
            System.out.println("i yeki");
            if (destination.j > origin.j) {
                for (int k = origin.index + 1; k < destination.index; k++) {
                    if (FXMLDocumentController.houses[k].piece != null) {
                        System.out.println("piece hast:k:"+k);
                        return;
                    }
                }
            } else {
                for (int k = destination.index + 1; k < origin.index; k++) {
                    if (FXMLDocumentController.houses[k].piece != null) {
                        System.out.println("piece hast:k:"+k);
                        return;
                    }
                }
            }

        } else if (destination.j == origin.j) {
            if (destination.i > origin.i) {
                System.out.println("Hello!");
                for (int k = origin.i + 8; k < destination.i; k = k+8) {
                    if (FXMLDocumentController.houses[k].piece != null) {
                        System.out.println("piece hast:k:"+k);
                        return;
                    }
                }
            } else {
                for (int k = destination.i + 8; k < origin.i; k += 8) {
                    if (FXMLDocumentController.houses[k].piece != null) {
                        return;
                    }
                }
            }
        }else{
            return;
        }

        if (FXMLDocumentController.turn % 2 == 1) {
            if (destination.piece != null) {
                FXMLDocumentController.player1_pieces.remove(destination.piece);
            }
        } else {
            if (destination.piece != null) {
                FXMLDocumentController.player2_pieces.remove(destination.piece);
            }
        }

        Image image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[origin.piece.index][FXMLDocumentController.turn % 2][destination.color]));
        System.out.println("O_o!!piece index:"+origin.piece.index);
        destination.imageView.setImage(image);
        origin.imageView.setImage(null);
        System.out.println("woow!");
        FXMLDocumentController.players[turn % 2].ChosenPiece = null;
        this.i = destination.i;
        this.j = destination.j;
        this.isChosen = false;
        this.house = destination;
        initial = 0;
        destination.piece = origin.piece;
        origin.piece = null;
        turn++;
    }

}
