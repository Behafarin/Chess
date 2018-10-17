public class Bishop implements man {
    public boolean AllowedMove(int i1,int j1,int i2, int j2,String str)
    {
        board brd=new board();
        if(Math.abs(i1-i2)!=Math.abs(j1-j2))
        {
            return false;
        }
        if(i2>i1 && j2>j1)
        {
            i1++;
            j1++;
            while(i1<i2 && j1<j2)
            {
                if(brd.board[i1][j1]!=null) {
                    return false;
                }
                i1++;
                j1++;
            }
        }
        if(i2<i1 && j2<j1)
        {
            i1--;
            j1--;
            while(i1>i2 && j1>j2)
            {
                if(brd.board[i1][j1]!=null) {
                    return false;
                }
                i1--;
                j1--;
            }
        }
        if(i2>i1 && j2<j1)
        {
            i1++;
            j1--;
            while(i1<i2 && j1>j2)
            {
                if(brd.board[i1][j1]!=null) {
                    return false;
                }
                i1++;
                j1--;
            }
        }
        if(i2<i1 && j1<j2)
        {
            i1--;
            j1++;
            while(i1>i2 && j1>j2)
            {
                if(brd.board[i1][j1]!=null) {
                    return false;
                }
                i1--;
                j1++;
            }
        }
        if(brd.board[i2][j2].charAt(1)==brd.board[i1][j1].charAt(1))
    }
}
