package sample;

import java.io.File;

public class King extends Pieces {
    King(String color){

        name = "K" ;
        this.color = color ;
        if(color.equals("White")){
            file = new File("White_King.png") ;
        }else {
            file = new File("Black_King.png") ;
        }
    }


//    @Override
//    boolean checker(int ox, int oy, int dx, int dy, Board[][] board) {
//        dx--;
//        ox--;
//        // bayad chek konim ke to khone haye  to masiresh mohre khodi nabashe !
//        if(Math.abs(dx-ox) >1 || Math.abs(dy-oy) >1)
//        {
//            return false;// harekato ride
//        }
//        if(board[ox][oy].square.equals("-"))
//        {
//            return false ;
//        }
//        //
//        if(board[ox][oy].pieces.color.equals(board[dx][dy].pieces.color))
//        {
//            return false; // yani khone hamrang boode
//        }
//
//        return true ; // age gire hichkodome if hamon nayoftad yani oke dge
//    }
//    void kishomat (Board[][] board)
//    {
//
//    }
}
