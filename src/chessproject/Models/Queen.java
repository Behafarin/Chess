package chessproject.Models;

import javafx.scene.image.ImageView;


public class Queen extends Piece{

    public Queen(int i, int j,Player owner,  ImageView image,House house) {
        super(i, j,owner, image,house);
        this.index = 4;
    }

    @Override
    public void Move(House origin, House destination) {
        
    }

   
}
