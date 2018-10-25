package chessproject.Models;

import javafx.scene.image.ImageView;


public abstract class Piece {
    public enum color {white,black};
    public int i,j;
    public boolean isChosen = false;
    public boolean isExists = true;
    public int index;
    public boolean isAchsen = false;
    public ImageView image;
    public Player owner;
    public House house;
    public Piece(int i, int j, Player owner, ImageView image,House house) {
        this.i = i;
        this.j = j;
        this.owner = owner;
        this.image = image;
        this.house = house;
    }
    
    public abstract void Move(House origin,House destination);
    
    
}
