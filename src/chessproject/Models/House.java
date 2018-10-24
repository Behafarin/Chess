package chessproject.Models;

import javax.swing.text.html.ImageView;

public class House {
    public int i,j;
    public Piece piece = null;
    public ImageView imageView = null;
    public int index;
    public int color;
    public House(int index, int i, int j) {
        this.i = i;
        this.j = j;
        this.index = index;
        if((i+j)%2 == 0){
            this.color = 0;
        }else{
            this.color = 1;
        }
    }
    
}
