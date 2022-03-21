package sample;

import java.io.File;

public class Rook extends Pieces {
    Rook(String color) {
        name = "R";
        this.color = color ;
        if(color.equals("White")){
            file = new File("White_Rook.png");
        }else {
            file = new File("Black_Rook.png");
        }
    }

    @Override
    boolean checker(int ox, int oy, int dx, int dy, Square[][] board) {
        String rang = board[ox][oy].pieces.color;
//        boolean can = false ;

//        ox--;
//        dx--;
        //check kone ke to khone maghsad mohre khodi has ya na
        // hamchenin yedone for bezanim ke agar amodi ya ofoghi bod i o j ba ye for ta destination bere
        //
        if (board[ox][oy].pieces.name.equals("Empty")) {
            return false;
        }
        //
        if (board[ox][oy].pieces.color.equals(board[dx][dy].pieces.color)) {
            return false; // yani khone hamrang boode
        }
        if ((ox != dx) && (oy != dy)) {
            return false; //aslan harekat ghabel ghabooli bara ghalee nazade
        }
        if (ox == dx) {
            if (dy > oy) {
                if (rang.equals("Black")) {
                    for (int i = oy + 1; i <= dy; i++) {
                        if (board[ox][i].pieces.color.equals("Black")) {
                            return false;// chon hamrang sare rahesh bode
                        }
                        if (board[ox][i].pieces.color.equals("White")) {
                            if (i == dy) { //agar dar maghsad bokhore oke gheire in na ride
                                return true;
                            }
                            return false;// chon hamrang sare rahesh bode
                        }
                    }
                }
                if (rang.equals("White")) {
                    for (int i = oy + 1; i <= dy; i++) {
                        if (board[ox][i].pieces.color.equals("White")) {
                            return false;// chon hamrang sare rahesh bode
                        }
                        if (board[ox][i].pieces.color.equals("Black")) {
                            if (i == dy) {
                                return true;//harifo zade sare rahesb
                            }
                            return false;// chon hharfio  sar rahesh bode
                        }
                    }
                }
            }
            if (dy < oy) {
                if (rang.equals("Black")) {
                    for (int i = oy - 1; i >= dy; i--) {
                        if (board[ox][i].pieces.color.equals("Black")) {
                            return false;// chon hamrang sare rahesh bode
                        }
                        if (board[ox][i].pieces.color.equals("White")) {
                            if (i == dy) {
                                return true;
                            }
                            return false;// chon hamrang sare rahesh bode
                        }
                    }
                }
                if (rang.equals("White")) {
                    for (int i = oy - 1; i >= dy; i--) {
                        if (board[ox][i].pieces.color.equals("White")) {
                            return false;// chon hamrang sare rahesh bode
                        }
                        if (board[ox][i].pieces.color.equals("Black")) {
                            if (i == dy) {
                                return true;
                            }
                            return false;// chon hamrang sare rahesh bode
                        }
                    }
                }
            }
        }
        if (oy == dy) {
            if (dx > ox) {
                if (rang.equals("White")) {
                    for (int i = ox + 1; i <= dx; i++) {
                        if (board[i][oy].pieces.color.equals("White")) {
                            return false;// chon hamrang sare rahesh bode
                        }
                        if (board[i][oy].pieces.color.equals("Black")) {
                            if (i == dx) {
                                return true;
                            }
                            return false;
                        }
                    }
                }
                if (rang.equals("Black")) {
                    {
                        for (int i = ox + 1; i <= dx; i++) {
                            if (board[i][oy].pieces.color.equals("Black")) {
                                return false;// chon hamrang sare rahesh bode
                            }
                            if (board[i][oy].pieces.color.equals("White")) {
                                if (i == dx) {
                                    return true;
                                }
                                return false;
                            }
                        }
                    }
                }
            }
            if (ox > dx) {
                if (rang.equals("Black")) {
                    for (int i = ox - 1; i >= dx; i--) {
                        if (board[i][dy].pieces.color.equals("Black")) {
                            return false;// hamrang bode
                        }
                        if (board[i][dy].pieces.color.equals("White")) {
                            if (i == dx) {
                                return true; // dar maghsad mizade
                            }
                            return false;// mohre harif sare rahesh bode bode
                        }

                    }
                }
                if (rang.equals("White")) {
                    for (int i = ox - 1; i >= dx; i--) {
                        if (board[i][dy].pieces.color.equals("White")) {
                            return false;// hamrang bode
                        }
                        if (board[i][dy].pieces.color.equals("Black")) {
                            if (i == dx) {
                                return true;
                            }
                            return false;// mohre harif sare rahesh bode bode
                        }

                    }
                }
            }
        }
        return true; // yani harekat ok boode
    }
//    @Override
//    void move(Square[][] boards, int dx, int dy, int ox, int oy) {
//        if (move(ox, oy, dx, dy, boards)) {
//            boards[dx][dy] = new Square(new Rook());
//            boards[dx][dy].setLocation(dx, dy);
//            boards[dx][dy].setColor(boards[ox][oy].pieces.color);
//
//            boards[ox][oy] = new Square();
//        }
}
