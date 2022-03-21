package sample;

import java.io.File;

public class Soldier extends Pieces {

    Soldier() {
        file = new File("White_Pawn.png");
        name = "S";
    }
//        try {
////            image = new Image(new FileInputStream(new File("src\\File\\White_Soldier.png").getPath()));
//            imageView.setImage(image);
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        }
//        name = "S" ;
//    }
        boolean first_move = true;

        boolean valid_move_checker(int ox, int oy, int dx, int dy, Square[][] board) {
            // check koiim bbinim asan lazeme ke exception asan throw bwshe ya na ?  bara soldier gozashtam
            // bara baghiue na , age didi nmikhad hazfesh kon faghat return false bokone
//        ox--;
//        dx--;//az kargar bepors bbin bayad hazf she ya na in menha menha ha

            // if() benevis ke to on khone binamos mohre hamrang age bood exception throw kone ya return false

            //ino bepors !!!
            if(board[ox][oy].pieces.name.equals("-"))
            {
                return false ;
            }
            //
            if(board[ox][oy].pieces.color.equals(board[dx][dy].pieces.color))
            {
                return false; // yani khone hamrang boode
            }
            if((first_move) && (Math.abs(dy-oy)==2) && (dx-1==ox-1))
            {
                first_move=false;
                return true;
            }
//        try {
            if ( ((Math.abs(dy - oy)) >1)) {
                return false;
//                throw new invalidmoveexception("eshtebah zadi dada");
            }
            //chek konim ke mitone mohre harifo bezane ya na
            if(board[ox][oy].pieces.color.equals("Black"))
            {
                if((board[ox-1][oy-1].pieces.color.equals("White") ||board[ox+1][oy-1].pieces.color.equals("White") ) && (Math.abs(dx-ox)==1)&&(Math.abs(dy-oy)==1) )
                {
                    first_move=false;

                    return true; // mitone bere va mohre harifo mizzane
                }
            }
            else if (board[ox][oy].pieces.color.equals("White"))
            {
                if((board[ox+1][oy+1].pieces.color.equals("Black") ||board[ox-1][oy+1].pieces.color.equals("Black") ) && (Math.abs(dx-ox)==1)&&(Math.abs(dy-oy)==1) )
                {
                    first_move=false;
                    return true; // mitone bere va mohre harifo mizzane
                }
            }
            // hala mikhaim begim age to  mahale shoro nabod hagh dare faghat yeki bere
            // ke bekhatere rangesh yekam be moshkel  mikhore ke eb nadare
            // bayad benevisim age to khone avalesh nabod mitone 2 ta bere
//        } catch (invalidmoveexception e) {
//            return false;
//        }
// az hame in if ha rad shod yani oke dge
            if(Math.abs(dy-oy)==1 && dx-1==ox-1  ){     first_move=false;
                return true  ; }

// gheire in bashe yani taraf ride va eshtebah zade pas false return mishe
            return false;   }

    @Override
    void move(Square[][] boards, int dx, int dy, int ox, int oy) {
        if (valid_move_checker(ox, oy, dx, dy, boards)) {
            boards[dx][dy] = new Square(new Soldier());
            boards[dx][dy].setLocation(dx, dy);
            boards[dx][dy].setColor(boards[ox][oy].pieces.color);

            boards[ox][oy] = new Square();
        }
    }
}


