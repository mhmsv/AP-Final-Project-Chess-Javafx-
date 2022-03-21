package sample;

import java.io.File;

public class Bishop extends Pieces {
    Bishop() {
        file = new File("White_Bishop.png");
        name = "F" ;
    }


    @Override
    boolean valid_move_checker(int ox, int oy, int dx, int dy, Square[][] board) {
        String rang = board[ox][oy].pieces.color;
//        ox--;dx--;
        if(board[ox][oy].pieces.name.equals("Empty"))
        {
            return false ;
        }
        //
        if(board[ox][oy].pieces.color.equals(board[dx][dy].pieces.color))
        {
            return false; // yani khone hamrang boode
        }
        if(Math.abs(dx-ox)!=Math.abs(dy-oy))
        { //kolan eshtebah zade harekate fil nabode
            return false;
        }
        //check kone ke to khone maghsad mohre khodi has ya na done
        // hamchenin yedone for bezanim ke i o j esh yeki yeki ziyad mishe ta berese be khone maghsad
        if(rang.equals("White")) {
            if(dx>ox) {
                int j = oy + 1;
                for (int i = ox+1 ; i <= dx  ; i++, j++) {
                    if(board[i][j].pieces.color.equals("White"))
                    {
                        return false; // sare rahesh mohre sefid bode
                    }
                    if(board[i][j].pieces.color.equals("Black"))
                    {
                        // sare rahesh mohre harfi nabashe
                        if(i==dx)
                        {return true;}// yani dar maghsad mizane harifoo pas okeeeeeeeee horaaaaa :)))
                        return false;
                    }
                }
            }
            if(ox>dx)
            {
                int j = oy +1;
                for (int i = ox-1; i <=dy ; i++,j++) {

                    if(board[i][j].pieces.color.equals("White"))
                    {
                        return false;  // sare rahesh mohre sefid bode
                    }
                    if(board[i][j].pieces.color.equals("Black"))
                    {
                        // sare rahesh mohre harfi nabashe
                        if(i==dx)
                        {return true;}// yani dar maghsad mizane harifoo // yani dar maghsad mizane harifoo pas okeeeeeeeee horaaaaa :)))
                        return false;
                    }
                }
            }
        }
        if(rang.equals("Black"))
        {
            if(dx>ox)
            {
                int j = oy-1;
                for (int i = ox+1; i <=dx  ; i++,j--) {

                    if(board[i][j].pieces.color.equals("Black"))
                    {
                        return false;
                    }
                    if(board[i][j].pieces.color.equals("White"))
                    {
                        // sare rahesh mohre harfi nabashe  age bashe nmishe dge
                        if(i==dx)
                        {return true;}// yani dar maghsad mizane harifoo
                        return false;
                    }
                }
            }
            if(ox>dx)
            {
                int j = oy-1;
                for (int i = ox-1; dx<=i ; i--,j--)
                {

                    if(board[i][j].pieces.color.equals("Black"))
                    {
                        return false;
                    }
                    if(board[i][j].pieces.color.equals("White"))
                    {
                        // sare rahesh mohre harfi nabashe  age bashe nmishe dge
                        if(i==dx)
                        {return true;}// yani dar maghsad mizane harifoo
                        return false;
                    }
                }
            }
        }

        // age harekat gheyre in bood return false bokone chon harekatesh chert bode
        return false;
    }
    @Override
    void move(Square[][] boards, int dx, int dy, int ox, int oy) {
        if (valid_move_checker(ox, oy, dx, dy, boards)) {
            boards[dx][dy] = new Square(new Bishop());
            boards[dx][dy].setLocation(dx, dy);
            boards[dx][dy].setColor(boards[ox][oy].pieces.color);

            boards[ox][oy] = new Square();
        }
    }
}
