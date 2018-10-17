public class board {
    String board[][]=new String[8][8];
    board() {
        board[0][0] = board[0][7] = "RB";
        board[0][1] = board[0][6] = "NB";
        board[0][2] = board[0][5] = "BB";
        board[0][3] = "KB";
        board[0][4] = "QB";
        board[7][0] = board[7][7] = "RW";
        board[7][1] = board[7][6] = "NW";
        board[7][2] = board[7][5] = "BW";
        board[7][3] = "KW";
        board[7][4] = "QW";
        for (int i = 0; i < 8; i++) {
            board[1][i] = "SB";
        }
        for (int i = 0; i < 8; i++) {
            board[6][i] = "SW";
        }
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = null;
            }
        }
    }
}
