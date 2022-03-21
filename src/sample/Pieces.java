package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Pieces {
    int x = 0, y = 0;
    //    javafx.scene.image.ImageView piecesPhoto ;
    File file ;
    @FXML
    Image image ;
    @FXML
    ImageView imageView ;
    String color , name ;

    Pieces() {
//        file = new File("Blank.png");
//        this.piecePhoto = new javafx.scene.image.ImageView("Blank.png");
        try {
            image = new Image(new FileInputStream(new File("Blank.png").getPath()));
            imageView.setImage(image);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        this.color = "Null";
        this.name = "Empty" ;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void move(Square[][] boards, int dx, int dy, int ox, int oy){
//        if (valid_move_checker(ox, oy, dx, dy, boards)) {
//            boards[dx][dy].setLocation(dx, dy);
//            boards[dx][dy].setColor(boards[ox][oy].pieces.color);
//            boards[dx][dy] = new Square();
//            boards[ox][oy] = new Square();
//            System.out.println("T");
//        } else {
//            System.out.println("F");
//        }

    }
//
//    // age kick checker true dad in tabe kick ro bayad seda bezanam !!!
//    String whoskicked(int dx, int dy, Square[][] board) {
//        board[dx][dy].piecePhoto = new javafx.scene.image.ImageView("C:\\Users\\موعود\\IdeaProjects\\ChessCom\\src\\Files\\Blank.png");
//// bayad dorost beshe badan ke meghdare dorostio return kone befahmim che mohre ei bode ke emtiyazesho dorost hesab konim
//        return board[dx][dy].piecePhoto.toString();
//    }
//
//    boolean kick(int dx, int dy, Square[][] board) {
//        if (board[dx][dy].pieces.color.equals("Black") || board[dx][dy].pieces.color.equals("White")) {
//            return true;
//        }
//        return false;
//    }
//
    boolean valid_move_checker(int ox, int oy, int dx, int dy, Square[][] board) {
        return false;
    }
    // ox ,oy mabda harekat
    // dx o dy maghsad
    // -1 bede yani ride nmishe
    //  1 bede yani mitone bere
    //2 bede yani mire mohre harifo mizane  badesh bayad badesh biyaim bbinam onto chi bode va ...(mokhtasato darim dge)

    // akhare hame moh
}
