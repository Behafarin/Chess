package chessproject.Models;
import javax.swing.text.html.ImageView;


public class Piece {
    public enum color {white,black};
    public int i,j;
    public boolean isChosen = false;
    public boolean isExists = true;
    public int index;
    public boolean isAchsen = false;
    public ImageView image;
    public Player owner;

    public Piece(int i, int j, Player owner, ImageView image) {
        this.i = i;
        this.j = j;
        this.owner = owner;
        this.image = image;
    }
    
    
}
