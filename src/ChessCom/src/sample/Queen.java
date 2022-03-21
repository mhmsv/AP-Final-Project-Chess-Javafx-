package sample;

import java.io.File;

public class Queen extends Pieces {
    Queen(String color) {
        name = "Q" ;
        this.color = color ;
        if(color.equals("White")){
            file = new File("White_Queen.png");
        }else {
            file = new File("Black_Queen.png");
        }
    }

//    @Override
//    boolean checker(int ox, int oy, int dx, int dy, Board[][] board)  {
//        ox--;
//        dx--;
//        // check kone ke ano gohi to msiresh hast ya na har jaei chon mitone bere faghat moshkel ine ke to masiresh mohre khodi nabashe
//        // ye for mire ta destinationesh va agar sar rah mohre hamrang bood false return mikone
//
//        if(board[ox][oy].square.equals("-"))
//        {
//            return false ;
//        }
//        //
//        if(board[ox][oy].pieces.color.equals(board[dx][dy].pieces.color))
//        {
//            return false; // yani khone hamrang boode
//        }
//        if(ox==dx ^ oy==dy) // harekat ghale ro mikhas bezane !
//        {
//            Rook rook = new Rook();
//            rook.checker(ox,oy,dx,dy,board);
//        }
//        if(Math.abs(ox-dx) == Math.abs(oy-dy)) // harekat fili
//        {
//            Bishop bishop = new Bishop();
////    bishop.checker(ox,oy,dx,dy,board);
//        }
//        return false;
//    }

}
