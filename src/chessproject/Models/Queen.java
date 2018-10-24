package chessproject.Models;

import javax.swing.text.html.ImageView;

public class Queen extends Piece implements P{
    public final int index = 4;

    public Queen(int i, int j,Player owner,  ImageView image) {
        super(i, j,owner, image);
    }

    @Override
    public void Move() {
        
    }
}
