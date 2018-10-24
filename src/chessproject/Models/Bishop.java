package chessproject.Models;
import javax.swing.text.html.ImageView;

public class Bishop extends Piece implements P{

    public Bishop(int i, int j,Player owner, ImageView image) {
        super(i, j,owner, image);
        this.index = 2;
    }

    @Override
    public void Move(House origin, House destination) {
        
    }
 
}
