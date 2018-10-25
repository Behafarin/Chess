package chessproject.Models;

import javafx.scene.image.ImageView;

public class Bishop extends Piece {

    public Bishop(int i, int j,Player owner, ImageView image,House house) {
        super(i, j,owner, image,house);
        this.index = 2;
    }

    @Override
    public void Move(House origin, House destination) {
        
    }
 
}
