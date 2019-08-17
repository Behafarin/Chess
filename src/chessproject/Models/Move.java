package chessproject.Models;

/**
 *
 * @author Launcher
 */
public class Move {
    public House origin,des;
    public Piece killed;
    public Move(House origin, House des,Piece killed) {
        this.origin = origin;
        this.des = des;
        this.killed = killed;
    }



}