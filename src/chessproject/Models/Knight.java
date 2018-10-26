package chessproject.Models;

import javafx.scene.image.ImageView;


public class Knight extends Piece {

    public Knight(int i, int j,Player owner, ImageView image, House house) {
        super(i, j,owner, image,house);
        this.index = 1;
    }

    @Override
    public void Move(House origin, House destination) {
        
    }
 
}
