package sample;

import java.io.File;

public class Queen extends Pieces {
    Queen() {
        file = new File("White_Queen.png");
        name = "Q" ;
    }

    @Override
    boolean valid_move_checker(int ox, int oy, int dx, int dy, Square[][] board)  {
//        ox--;
//        dx--;
        // check kone ke ano gohi to msiresh hast ya na har jaei chon mitone bere faghat moshkel ine ke to masiresh mohre khodi nabashe
        // ye for mire ta destinationesh va agar sar rah mohre hamrang bood false return mikone

        if(board[ox][oy].pieces.name.equals("Empty"))
        {
            return false ;
        }
        //
        if(board[ox][oy].pieces.color.equals(board[dx][dy].pieces.color))
        {
            return false; // yani khone hamrang boode
        }
        if(ox==dx ^ oy==dy) // harekat ghale ro mikhas bezane !
        {
            Rook rook = new Rook();
            rook.valid_move_checker(ox,oy,dx,dy,board);
        }
        if(Math.abs(ox-dx) == Math.abs(oy-dy)) // harekat fili
        {
            Bishop bishop = new Bishop();
    bishop.valid_move_checker(ox,oy,dx,dy,board);
        }
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
