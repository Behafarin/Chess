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
    public boolean Move(House origin, House destination) {
        if (destination.piece != null && destination.piece.owner == FXMLDocumentController.players[FXMLDocumentController.turn % 2]) {
            return false;
        }
        if (destination == origin) {
            return false;
        }
        if(destination.piece!=null && destination.piece.index==5)
        {
            return false;
        }
        System.out.println("ROCK");
        if (destination.i == origin.i) {
            System.out.println("i yeki");
            if (destination.j > origin.j) {
                for (int k = origin.index + 1; k < destination.index; k++) {
                    if (FXMLDocumentController.houses[k].piece != null) {
                        System.out.println("piece hast:k:"+k);
                        return false;
                    }
                }
            } else {
                for (int k = destination.index + 1; k < origin.index; k++) {
                    if (FXMLDocumentController.houses[k].piece != null) {
                        System.out.println("piece hast:k:"+k);
                        return false;
                    }
                }
            }

        } else if (destination.j == origin.j) {
            if (destination.i > origin.i) {
                System.out.println("Hello!");
                for (int k = origin.index + 8; k < destination.index; k = k+8) {
                    if (FXMLDocumentController.houses[k].piece != null) {
                        System.out.println("piece hast:k:"+k);
                        return false;
                    }
                }
            } else {
                for (int k = destination.index + 8; k < origin.index; k += 8) {
                    if (FXMLDocumentController.houses[k].piece != null) {
                        return false;
                    }
                }
            }
        }else{
            return false;
        }
        return true;
    }

}