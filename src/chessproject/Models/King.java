package chessproject.Models;

import javax.swing.text.html.ImageView;

public class King extends Piece implements P{
    public final int index = 5;

    public boolean hasChecked = false;
    public King(int i, int j,Player owner,  ImageView image) {
        super(i, j,owner, image);
    }
    @Override
    public void Move() {
        
    }
}
