package chessproject.Models;

import javafx.scene.image.ImageView;


public class King extends Piece{

    public boolean hasChecked = false;
    public King(int i, int j,Player owner,  ImageView image,House house) {
        super(i, j,owner, image,house);
        this.index = 5;
    }

    @Override
    public void Move(House origin, House destination) {
        
    }

}
