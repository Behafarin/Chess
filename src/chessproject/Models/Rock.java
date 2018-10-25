package chessproject.Models;

import javafx.scene.image.ImageView;


public class Rock extends Piece{
    public final int index = 3;

    public Rock(int i, int j,Player owner ,ImageView image,House house) {
        super(i, j,owner, image,house);
    }

    @Override
    public void Move(House origin, House destination) {
        
    }

}
