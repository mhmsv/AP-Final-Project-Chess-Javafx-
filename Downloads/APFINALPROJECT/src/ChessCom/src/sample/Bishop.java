package sample;

import java.io.File;

public class Bishop extends Pieces {
    Bishop(String color) {
        file = new File("White_Bishop.png");
        name = "F" ;
        this.color = color ;
        if(color.equals("White")){
            file = new File("White_Bishop.png");
        }else {
            file = new File("Black_Bishop.png");
        }
    }


//    @Override
//    boolean checker(int ox, int oy, int dx, int dy, Board[][] board) {
//        String rang = board[ox][oy].pieces.color;
////        ox--;dx--;
//        if(board[ox-1][oy].square.equals("E"))
//        {
//            return false ;
//        }
//        //
//        if(board[ox-1][oy].pieces.color.equals(board[dx-1][dy].pieces.color))
//        {
//            return false; // yani khone hamrang boode
//        }
//        if(Math.abs(dx-ox)!=Math.abs(dy-oy))
//        { //kolan eshtebah zade harekate fil nabode
//            return false;
//        }
//        //check kone ke to khone maghsad mohre khodi has ya na done
//        // hamchenin yedone for bezanim ke i o j esh yeki yeki ziyad mishe ta berese be khone maghsad
//        if(rang.equals("White")) {
//            if(dx>ox) {
//                int j = oy + 1;
//                for (int i = ox ; i <= dx -1 ; i++, j++) {
//                    if(board[i][j].pieces.color.equals("White"))
//                    {
//                        return false; // sare rahesh mohre sefid bode
//                    }
//                    if(board[i][j].pieces.color.equals("Black"))
//                    {
//                        // sare rahesh mohre harfi nabashe
//                        if(i==dx-1)
//                        {return true;}// yani dar maghsad mizane harifoo pas okeeeeeeeee horaaaaa :)))
//                        return false;
//                    }
//                }
//            }
//            if(ox-1>dx-1)
//            {
//                int j = oy +1;
//                for (int i = ox-2; i <=dy ; i++,j++) {
//
//                    if(board[i][j].pieces.color.equals("White"))
//                    {
//                        return false;  // sare rahesh mohre sefid bode
//                    }
//                    if(board[i][j].pieces.color.equals("Black"))
//                    {
//                        // sare rahesh mohre harfi nabashe
//                        if(i==dx-1)
//                        {return true;}// yani dar maghsad mizane harifoo // yani dar maghsad mizane harifoo pas okeeeeeeeee horaaaaa :)))
//                        return false;
//                    }
//                }
//            }
//        }
//        if(rang.equals("Black"))
//        {
//            if(dx-1>ox-1)
//            {
//                int j = oy-1;
//                for (int i = ox; i <=dx -1 ; i++,j--) {
//
//                    if(board[i][j].pieces.color.equals("Black"))
//                    {
//                        return false;
//                    }
//                    if(board[i][j].pieces.color.equals("White"))
//                    {
//                        // sare rahesh mohre harfi nabashe  age bashe nmishe dge
//                        if(i==dx-1)
//                        {return true;}// yani dar maghsad mizane harifoo
//                        return false;
//                    }
//                }
//            }
//            if(ox-1>dx-1)
//            {
//                int j = oy-1;
//                for (int i = ox-2; dx-1<=i ; i--,j--)
//                {
//
//                    if(board[i][j].pieces.color.equals("Black"))
//                    {
//                        return false;
//                    }
//                    if(board[i][j].pieces.color.equals("White"))
//                    {
//                        // sare rahesh mohre harfi nabashe  age bashe nmishe dge
//                        if(i==dx-1)
//                        {return true;}// yani dar maghsad mizane harifoo
//                        return false;
//                    }
//                }
//            }
//        }
//
//        // age harekat gheyre in bood return false bokone chon harekatesh chert bode
//        return false;
//    }
}
