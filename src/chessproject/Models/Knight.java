package chessproject.Models;

import javafx.scene.image.ImageView;


public class Knight extends Piece {
    public final int index = 1;

    public Knight(int i, int j,Player owner, ImageView image, House house) {
        super(i, j,owner, image,house);
    }

    @Override
    public void Move(House origin, House destination) {
        
    }
 
}
