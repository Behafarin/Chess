package chessproject.Models;

import javax.swing.text.html.ImageView;


public class Pawn extends Piece implements P{
    public final int index = 0;

    public Pawn(int i, int j,Player owner,  ImageView image) {
        super(i, j,owner, image);
    }

    @Override
    public void Move(House origin, House destination) {
        
    }
  
    
}
