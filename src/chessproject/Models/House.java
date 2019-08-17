package chessproject.Models;

import chess.FXMLDocumentController;
import java.io.File;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class House {
    public int i,j;
    public Piece piece = null;
    public ImageView imageView;
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
        if (this.piece!= null) {
            File file = new File(FXMLDocumentController.images[piece.index][FXMLDocumentController.turn%2][this.color]);
            Image image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }
    }
    
}
