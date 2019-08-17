package chessproject.Models;

import chess.FXMLDocumentController;
import static chess.FXMLDocumentController.turn;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pawn extends Piece {

    public int initial = 1;

    public Pawn(int i, int j, Player owner, ImageView image, House house) {
        super(i, j, owner, image, house);
        this.index = 0;
    }

    @Override
    public boolean Move(House origin, House destination) {
//        System.err.println("Khob Oomadim!");
        if (destination.piece == null && destination.j == origin.j) {
            System.out.println("O_o!");
            if (FXMLDocumentController.turn % 2 == 1) {
                if (origin.i + 1 == destination.i
                        || (initial == 1 && origin.i + 2 == destination.i && (FXMLDocumentController.houses[origin.index + 8].piece == null))) {
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println("i:" + origin.i + ",j:" + origin.j + ",index:" + origin.index);
                System.out.println("i:" + destination.i + ",j:" + destination.j + ",index:" + destination.index);
                if (origin.i - 1 == destination.i
                        || (initial == 1 && origin.i - 2 == destination.i && (FXMLDocumentController.houses[origin.index - 8].piece == null))) {
                    return true;
                } else {
                    return false;
                }
            }
//            if (FXMLDocumentController.turn % 2 == 1) {
//                if (destination.i == 8) {
//                    FXMLDocumentController.player2_pieces.remove(destination.piece);
//                    destination.piece = new Queen(destination.i, destination.j, FXMLDocumentController.players[1], null, destination);
//                    FXMLDocumentController.player2_pieces.add(destination.piece);
//                    Image image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[4][1][destination.color]));
//                    destination.imageView.setImage(image);
//                }
//            } else {
//                if (destination.i == 1) {
//                    FXMLDocumentController.player1_pieces.remove(destination.piece);
//                    destination.piece = new Queen(destination.i, destination.j, FXMLDocumentController.players[0], null, destination);
//                    Image image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[4][0][destination.color]));
//                    destination.imageView.setImage(image);
//                    FXMLDocumentController.player1_pieces.add(destination.piece);
//                }
//            }
        } else if (destination.piece != null  && destination.piece.index!=5 && destination.piece.owner != FXMLDocumentController.players[turn % 2]) {
            if (FXMLDocumentController.turn % 2 == 1) {
                if (origin.i + 1 == destination.i && (origin.j + 1 == destination.j || origin.j - 1 == destination.j)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println("i:" + origin.i + ",j:" + origin.j + ",index:" + origin.index);
                System.out.println("i:" + destination.i + ",j:" + destination.j + ",index:" + destination.index);
                if (origin.i - 1 == destination.i && (origin.j + 1 == destination.j || origin.j - 1 == destination.j)) {
                    return true;
                } else {
                    return false;
                }
            }
//            if (FXMLDocumentController.turn % 2 == 1) {
//                if (destination.i == 8) {
//                    FXMLDocumentController.player2_pieces.remove(destination.piece);
//                    destination.piece = new Queen(destination.i, destination.j, FXMLDocumentController.players[1], null, destination);
//                    FXMLDocumentController.player2_pieces.add(destination.piece);
//                    Image image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[4][1][destination.color]));
//                    destination.imageView.setImage(image);
//                }
//            } else {
//                if (destination.i == 1) {
//                    FXMLDocumentController.player1_pieces.remove(destination.piece);
//                    destination.piece = new Queen(destination.i, destination.j, FXMLDocumentController.players[0], null, destination);
//                    FXMLDocumentController.player1_pieces.add(destination.piece);
//                    Image image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[4][0][destination.color]));
//                    destination.imageView.setImage(image);
//                }
//            }
        }
        return false;
    }
}