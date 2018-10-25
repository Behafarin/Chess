package chessproject.Models;

import chess.FXMLDocumentController;
import static chess.FXMLDocumentController.turn;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pawn extends Piece {

    public final int index = 0;
    public int initial = 1;

    public Pawn(int i, int j, Player owner, ImageView image, House house) {
        super(i, j, owner, image, house);
    }

    @Override
    public void Move(House origin, House destination) {
        System.err.println("Khob Oomadim!");
        if (destination.piece == null && destination.j == origin.j) {
            System.out.println("O_o!");
            if (FXMLDocumentController.turn % 2 == 1) {
                if (origin.i + 1 == destination.i
                        || (initial == 1 && origin.i + 2 == destination.i && (FXMLDocumentController.houses[origin.index + 8].piece == null))) {
                    Image image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[origin.piece.index][FXMLDocumentController.turn % 2][destination.color]));
                    destination.imageView.setImage(image);
                    origin.imageView.setImage(null);
                    System.out.println("woow!");
                } else {
                    return;
                }
            } else {
                System.out.println("i:" + origin.i + ",j:" + origin.j + ",index:" + origin.index);
                System.out.println("i:" + destination.i + ",j:" + destination.j + ",index:" + destination.index);
                if (origin.i - 1 == destination.i
                        || (initial == 1 && origin.i - 2 == destination.i && (FXMLDocumentController.houses[origin.index - 8].piece == null))) {
//                    origin.imageView.setImage(new Image(
//                            new File("images/King_black_black").toURI().toString()));
                    System.out.println("OOOOOO:))");
                    Image image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[origin.piece.index][FXMLDocumentController.turn % 2][destination.color]));
                    destination.imageView.setImage(image);
                    origin.imageView.setImage(null);
//                    destination.imageView.setImage(new Image(new File(FXMLDocumentController.images[0][0][destination.color]).toURI().toString()));
                } else {
                    return;
                }
            }
            FXMLDocumentController.players[turn % 2].ChosenPiece = null;

            this.i = destination.i;
            this.j = destination.j;
            this.isChosen = false;
            this.house = destination;
            initial = 0;
            destination.piece = origin.piece;
            origin.piece = null;
            if (FXMLDocumentController.turn % 2 == 1) {
                if (destination.i == 8) {
                    FXMLDocumentController.player2_pieces.remove(destination.piece);
                    destination.piece = new Queen(destination.i, destination.j, FXMLDocumentController.players[1], null, destination);
                    FXMLDocumentController.player2_pieces.add(destination.piece);
                    Image image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[4][1][destination.color]));
                    destination.imageView.setImage(image);
                }
            } else {
                if (destination.i == 1) {
                    FXMLDocumentController.player1_pieces.remove(destination.piece);
                    destination.piece = new Queen(destination.i, destination.j, FXMLDocumentController.players[0], null, destination);
                    Image image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[4][0][destination.color]));
                    destination.imageView.setImage(image);
                    FXMLDocumentController.player1_pieces.add(destination.piece);
                }
            }
            turn++;
        } else if (destination.piece != null && destination.piece.owner != FXMLDocumentController.players[turn % 2]) {
            if (FXMLDocumentController.turn % 2 == 1) {
                if (origin.i + 1 == destination.i && (origin.j + 1 == destination.j || origin.j - 1 == destination.j)) {
                    Image image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[origin.piece.index][FXMLDocumentController.turn % 2][destination.color]));
                    destination.imageView.setImage(image);
                    origin.imageView.setImage(null);
                    FXMLDocumentController.player1_pieces.remove(destination.piece);
                    System.out.println("delete!!");
                } else {
                    return;
                }
            } else {
                System.out.println("i:" + origin.i + ",j:" + origin.j + ",index:" + origin.index);
                System.out.println("i:" + destination.i + ",j:" + destination.j + ",index:" + destination.index);
                if (origin.i - 1 == destination.i && (origin.j + 1 == destination.j || origin.j - 1 == destination.j)) {
                    //                    origin.imageView.setImage(new Image(
                    //                            new File("images/King_black_black").toURI().toString()));
                    System.out.println("del");
                    Image image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[origin.piece.index][FXMLDocumentController.turn % 2][destination.color]));
                    destination.imageView.setImage(image);
                    origin.imageView.setImage(null);
                    FXMLDocumentController.player2_pieces.remove(destination.piece);
                    //                    destination.imageView.setImage(new Image(new File(FXMLDocumentController.images[0][0][destination.color]).toURI().toString()));
                } else {
                    return;
                }
            }
            FXMLDocumentController.players[turn % 2].ChosenPiece = null;

            this.i = destination.i;
            this.j = destination.j;
            this.isChosen = false;
            this.house = destination;
            destination.piece = origin.piece;
            origin.piece = null;
            initial = 0;
            System.out.println("des:i:" + destination.i + ",j:" + destination.j);
            if (FXMLDocumentController.turn % 2 == 1) {
                if (destination.i == 8) {
                    FXMLDocumentController.player2_pieces.remove(destination.piece);
                    destination.piece = new Queen(destination.i, destination.j, FXMLDocumentController.players[1], null, destination);
                    FXMLDocumentController.player2_pieces.add(destination.piece);
                    Image image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[4][1][destination.color]));
                    destination.imageView.setImage(image);
                }
            } else {
                if (destination.i == 1) {
                    FXMLDocumentController.player1_pieces.remove(destination.piece);
                    destination.piece = new Queen(destination.i, destination.j, FXMLDocumentController.players[0], null, destination);
                    FXMLDocumentController.player1_pieces.add(destination.piece);
                    Image image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[4][0][destination.color]));
                    destination.imageView.setImage(image);
                }
            }
            turn++;
        }
    }
}
