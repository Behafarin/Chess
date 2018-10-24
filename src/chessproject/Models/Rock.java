package chessproject.Models;

import javax.swing.text.html.ImageView;

public class Rock extends Piece implements P{
    public final int index = 3;

    public Rock(int i, int j,Player owner ,ImageView image) {
        super(i, j,owner, image);
    }
    @Override
    public void Move() {
        
    }
}
