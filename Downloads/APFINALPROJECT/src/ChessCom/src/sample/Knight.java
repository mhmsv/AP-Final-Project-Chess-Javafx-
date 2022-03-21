package sample;

import java.io.File;

public class Knight extends Pieces {
    Knight(String color) {

        name = "H" ;
        this.color = color ;
        if(color.equals("White")){
            file = new File("White_Knight") ;
        }else {
            file = new File("Black_Knight") ;
        }
    }

    @Override
    public boolean checker(int ox, int oy, int dx, int dy, Square[][] board)  {
//        ox--;
//        dx--;
        // ghable hame inha check shavad ke khoneye destination agar mohre hamrang bod bege be an khordim va edame nadim
//        try {
        if(board[ox][oy].pieces.name.equals("Empty"))
        {
            return false ;
        }
        //
        if(board[ox][oy].pieces.color.equals(board[dx][dy].pieces.color))
        {
            return false; // yani khone hamrang boode
        }
        if (Math.abs(dy - oy) > 2 || Math.abs(dx - ox) > 2) {
            return false;  //harekat gheire mojaz
//                throw new invalidmoveexception("eshtebah zadi dadash");
        }
//            }
//        }
//        catch (invalidmoveexception e){return false;}
        if((Math.abs(dy-oy)==1) && (Math.abs(dx-ox)==2))
        {
            // tanha harakate mojaz aghaye asb
            return true;
        }
        if((Math.abs(dy-oy)==2) && (Math.abs(dx-ox)==1))
        {
            // tanha harakate mojaz aghaye asb

            return true ;
        }

        // bbin age try catch nmikhad hazf beshe va return false kone
//            try {
        if (Math.abs(dy - oy) > 2 || Math.abs(dx - ox) > 2) {
            return false;
//                    throw new invalidmoveexception("eshtebah zadi dadash");
        }
//            catch (invalidmoveexception e){return false;}

        // ride bayad return false beshe
        return false;
    }
//    @Override
//    void move(Square[][] boards, int dx, int dy, int ox, int oy) {
//        if (checker(ox, oy, dx, dy, boards)) {
//            boards[dx][dy] = new Square(new Knight());
//            boards[dx][dy].setLocation(dx, dy);
//            boards[dx][dy].setColor(boards[ox][oy].pieces.color);
//
//            boards[ox][oy] = new Square();
//        }
//    }
}
