package chessproject.Models;

import chess.FXMLDocumentController;
import static chess.FXMLDocumentController.turn;
import javafx.scene.image.ImageView;

public class Queen extends chessproject.Models.Piece{

    public int initial = 1;

    public Queen(int i, int j, Player owner, ImageView image, House house) {

        super(i, j, owner, image, house);
        this.index = 4;
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

        } else if (Math.abs(destination.i - origin.i) == Math.abs(destination.j - origin.j) && destination.piece != null && destination.piece.index!=5 && !origin.piece.isAchsen && destination.piece.owner != FXMLDocumentController.players[turn % 2]) {
            if (destination.i > origin.i && destination.j > origin.j) {
                int k = 9; //checking next houses without changing origin i or j
                boolean isempty = true;
                while (origin.index + k < destination.index) {
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
        } else if (origin.i == destination.i && destination.piece == null && !origin.piece.isAchsen) {
            if (destination.j > origin.j) {
                for (int k = origin.index + 1; k < destination.index; k++) {
                    if (FXMLDocumentController.houses[k].piece != null) {
                        return false;
                    }
                }
            } else {
                for (int k = destination.index + 1; k < origin.index; k++) {
                    if (FXMLDocumentController.houses[k].piece != null) {
                        return false;
                    }
                }
            }
            return true;
        } else if (origin.j == destination.j && destination.piece == null && !origin.piece.isAchsen) {
            if (destination.i > origin.i) {
                for (int k = origin.index + 8; k < destination.index; k += 8) {
                    if (FXMLDocumentController.houses[k].piece != null) {
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
            return true;
        } else if (origin.i == destination.i && destination.piece != null && destination.piece.index!=5 && !origin.piece.isAchsen) {
            if (destination.j > origin.j) {
                for (int k = origin.index + 1; k < destination.index; k += 1) {
                    if (FXMLDocumentController.houses[k].piece != null) {
                        return false;
                    }
                }
            } else {
                for (int k = destination.index + 1; k < origin.index; k += 1) {
                    if (FXMLDocumentController.houses[k].piece != null) {
                        return false;
                    }
                }
            }
            return true;
        } else if (origin.j == destination.j && destination.piece != null && destination.piece.index!=5 && !origin.piece.isAchsen) {
            if (destination.i > origin.i) {
                for (int k = origin.index + 8; k < destination.index; k += 8) {
                    if (FXMLDocumentController.houses[k].piece != null) {
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
            return true;
        }
        return false;
    }


}