package chessproject.Models;

import javafx.scene.image.ImageView;
import chess.FXMLDocumentController;
import static chess.FXMLDocumentController.turn;
import javafx.scene.image.Image;

public class Bishop extends Piece {

    public Bishop(int i, int j, Player owner, ImageView image, House house) {
        super(i, j, owner, image, house);
        this.index = 2;
    }

    @Override
    public boolean Move(House origin, House destination) {
        if (Math.abs(destination.i - origin.i) == Math.abs(destination.j - origin.j) && destination.piece == null && !origin.piece.isAchsen) {

            if (destination.i > origin.i && destination.j > origin.j) {
                int k = 9; //checking next houses without changing origin i or j
                boolean isempty = true;
                while (origin.index + k <= destination.index) {
                    if (FXMLDocumentController.houses[origin.index + k].piece == null) {
                        k += 9;
                    } else {
                        isempty = false;
                        return false;
                    }
                }
                if (isempty) {
                    return true;
                }
            }
            if (destination.i < origin.i && destination.j < origin.j) {
                int k = 9;
                boolean isempty = true;
                while (origin.index - k >= destination.index) {
                    if (FXMLDocumentController.houses[origin.index - k].piece == null) {
                        k += 9;
                    } else {
                        isempty = false;
                        return false;
                    }
                }
                if (isempty) {
                    return true;
                }
            }
            if (destination.i > origin.i && destination.j < origin.j) {
                int k = 7;
                boolean isempty = true;
                while (origin.index + k <= destination.index) {
                    if (FXMLDocumentController.houses[origin.index + k].piece == null) {
                        k += 7;
                    } else {
                        isempty = false;
                        return false;
                    }
                }
                if (isempty) {
                    return true;
                }
            }
            if (destination.i < origin.i && destination.j > origin.j) {
                int k = 7;
                boolean isempty = true;
                while (origin.index - k >= destination.index) {
                    if (FXMLDocumentController.houses[origin.index - k].piece == null) {
                        k += 7;
                    } else {
                        isempty = false;
                        return false;
                    }
                }
                if (isempty) {
                    return true;
                }
            }
        }
        else if (Math.abs(destination.i - origin.i) == Math.abs(destination.j - origin.j)
                && destination.piece != null && destination.piece.index!=5 && destination.piece.owner != FXMLDocumentController.players[turn%2]&&!origin.piece.isAchsen) {

            if (destination.i > origin.i && destination.j > origin.j) {
                int k = 9; //checking next houses without changing origin i or j
                boolean isempty = true;
                while (origin.index + k < destination.index) {
                    if (FXMLDocumentController.houses[origin.index + k].piece == null) {
                        k += 9;
                    } else {
                        isempty = false;
                        return true;
                    }
                }
                if (isempty) {
                    return true;
                }
            }
            if (destination.i < origin.i && destination.j < origin.j) {
                int k = 9;
                boolean isempty = true;
                while (origin.index - k > destination.index) {
                    if (FXMLDocumentController.houses[origin.index - k].piece == null) {
                        k += 9;
                    } else {
                        isempty = false;
                        return false;
                    }
                }
                if (isempty) {
                    return true;
                }
            }
            if (destination.i > origin.i && destination.j < origin.j) {
                int k = 7;
                boolean isempty = true;
                while (origin.index + k < destination.index) {
                    if (FXMLDocumentController.houses[origin.index + k].piece == null) {
                        k += 7;
                    } else {
                        isempty = false;
                        return false;
                    }
                }
                if (isempty) {
                    return true;
                }
            }
            if (destination.i < origin.i && destination.j > origin.j) {
                int k = 7;
                boolean isempty = true;
                while (origin.index - k > destination.index) {
                    if (FXMLDocumentController.houses[origin.index - k].piece == null) {
                        k += 7;
                    } else {
                        isempty = false;
                        return false;
                    }
                }
                if (isempty) {
                    return true;
                }
            }
        }
        return false;
    }

}