package sample;

import java.io.File;

public class King extends Pieces {
    King(){
        file = new File("White_King.png") ;
        name = "K" ;
    }

    boolean king_kish_check(int ox , int oy, int dx, int dy, Square[][] board) {
        String rang = board[ox][oy].pieces.color;

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if(!board[i][j].pieces.name.equals("Empty") && !board[i][j].pieces.color.equals(rang))
                    {
                       // i o j mishan ox o oy e mohre harif ta check beshe ke mire onja ya na
                       // dx o dy king hamon dx o dy mohre harif mishan
                       if(board[i][j].pieces.name.equals("S"))
                       {
                           Soldier soldier = new Soldier();

                           if(soldier.valid_move_checker(i,j,dx,dy,board))
                           {
                               return false ;
                           }
                       }
                        if(board[i][j].pieces.name.equals("H"))
                        {
                            //horse boood

                                Knight knight = new Knight();

                                if(knight.valid_move_checker(i,j,dx,dy,board))
                                {
                                    return false ;
                                }

                        }
                        if(board[i][j].pieces.name.equals("Q"))
                        {
//queen bood

                                Queen queen = new Queen();

                                if(queen.valid_move_checker(i,j,dx,dy,board))
                                {
                                    return false ;
                                }

                        }
                        if(board[i][j].pieces.name.equals("K"))
                        {
//king bood

                                King king = new King();

                                if(king.valid_move_checker(i,j,dx,dy,board))
                                {
                                    return false ;
                                }

                        }
                        if(board[i][j].pieces.name.equals("F"))
                        {
//bishop bood

                                Bishop bishop = new Bishop();

                                if(bishop.valid_move_checker(i,j,dx,dy,board))
                                {
                                    return false ;
                                }

                        }
                        if(board[i][j].pieces.name.equals("R"))
                        {
//rook bood

                                Rook rook = new Rook();

                                if(rook.valid_move_checker(i,j,dx,dy,board))
                                {
                                    return false ;
                                }

                        }
                    }
                }
            }
return true; // yani hich khone ei tahdid nmikonash
            }




    @Override
    boolean valid_move_checker(int ox, int oy, int dx, int dy, Square[][] board) {
//        dx--;
//        ox--;
        if(board[ox][oy].pieces.name.equals("Empty"))
        {
            return false ;
        }
        // ghale raftaan
        if (oy == dy && (board[ox][oy].pieces.color.equals(board[dx][dy].pieces.color)) && board[dx][dy].pieces.name.equals("R")) {
            int first,last;
            if(ox<dx){first=ox+1;last=dx;}
            else { last =ox;first=dx+1;}
            for (int i = first; i <last ; i++) {

                if( !board[i][dy].pieces.name.equals("empty"))
                {
                    break;
                }
            }
            return true;
        }

        // bayad chek konim ke to khone haye  to masiresh mohre khodi nabashe !
        if(Math.abs(dx-ox) >1 || Math.abs(dy-oy) >1)
        {
            return false;// harekato ride
        }


        if(board[ox][oy].pieces.color.equals(board[dx][dy].pieces.color))
        {
            return false; // yani khone hamrang boode
        }

        return true ; // age gire hichkodome if hamon nayoftad yani oke dge
    }
    @Override
    void move(Square[][] boards, int dx, int dy, int ox, int oy) {
        if (valid_move_checker(ox, oy, dx, dy, boards)) {
            boards[dx][dy] = new Square(new King());
            boards[dx][dy].setLocation(dx, dy);
            boards[dx][dy].setColor(boards[ox][oy].pieces.color);

            boards[ox][oy] = new Square();
        }
    }

}
