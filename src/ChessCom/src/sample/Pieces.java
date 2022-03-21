package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.awt.*;
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
            imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(!Main.first){//inja qarare avvalin khone ro bzane o x o y ono previous ha save konim
                    Main.prX = getX();
                    Main.prY = getY();
                }
                else {//aln khooneye dovvom ro zadim (set kardan new ha)
                    if(checker(Main.prX, Main.prY, Main.neX, Main.neY, Main.square)) {
                        Main.neX = getX();
                        Main.neY = getY();
                    }else{
                        Main.first = false;
                    }
                }
            }
        });
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        this.color = "Null";
        this.name = "Empty" ;


//        imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                if(!Main.first){//inja qarare avvalin khone ro bzane o x o y ono previous ha save konim
//                    Main.prX = getX();
//                    Main.prY = getY();
//                }
//                else {//aln khooneye dovvom ro zadim (set kardan new ha)
//                    if(checker(Main.prX, Main.prY, Main.neX, Main.neY, Main.square)) {
//                        Main.neX = getX();
//                        Main.neY = getY();
//                    }else{
//                        Main.first = false;
//                    }
//                }
//            }
//        });
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

    public int getX(){
        return x ;
    }

    public int getY(){
        return y ;
    }
//    void move(Square[][] boards, int dx, int dy, int ox, int oy){
//        if (checker(ox, oy, dx, dy, boards)) {
//            boards[dx][dy] = new Square();
//            boards[dx][dy].setLocation(dx, dy);
//            boards[dx][dy].setColor(boards[ox][oy].pieces.color);
//            boards[ox][oy] = new Square();
//            System.out.println("T");
//        } else {
//            System.out.println("F");
//        }
//
//    }
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
    boolean checker(int ox, int oy, int dx, int dy, Square[][] board) {
        return true;
    }
    // ox ,oy mabda harekat
    // dx o dy maghsad
    // -1 bede yani ride nmishe
    //  1 bede yani mitone bere
    //2 bede yani mire mohre harifo mizane  badesh bayad badesh biyaim bbinam onto chi bode va ...(mokhtasato darim dge)

    // akhare hame moh
}
