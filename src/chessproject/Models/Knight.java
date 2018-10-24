package chessproject.Models;

import javax.swing.text.html.ImageView;

public class Knight extends Piece implements P{
    public final int index = 1;

    public Knight(int i, int j,Player owner, ImageView image) {
        super(i, j,owner, image);
    }
    @Override
    public void Move() {
        
    }
}
