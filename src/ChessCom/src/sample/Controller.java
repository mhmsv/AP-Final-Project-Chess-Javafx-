package ChessCom.src.sample;

import ChessCom.src.sample.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import sample.Knight;
import sample.Square;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
//    static Square[][] square = new Square[8][8] ;
    @FXML
    GridPane grid;

    public void Move(){
        int px = Main.prX;
        int py = Main.prY;
        int nx = Main.neX;
        int ny = Main.neY;
        if(!Main.first){    //qarare on effect khonehaii k mitone harekat kone avaz she o first true she k serie bad khooneye dovoom ro bgire
            System.out.println(Main.square[px][py].pieces.checker(px,py,nx,ny,Main.square));
            Main.first = true;
        }
        else{
            Main.square[px][py].pieces.imageView.setOpacity(0);
            grid.add(Main.square[nx][ny].pieces.imageView, py, px);
            if(Main.square[px][py].pieces instanceof Knight){
                Main.square[nx][ny] = new Square(new Knight(Main.square[nx][ny].pieces.color));
                Main.square[nx][ny].setLocation(nx, ny);
            }
            grid.add(Main.square[nx][ny].pieces.imageView, ny, nx);
            Main.first = false;
        }

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        imageViews = new ImageView[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ImageView imageViews = new ImageView();
                if ((i == 6)) {
                    Main.square[i][j] = new Square(new Soldier("White"));
                    Main.square[i][j].setColor("White");
                    Main.square[i][j].setLocation(i, j);
                    imageViews.setImage(Main.square[i][j].piecePhoto);
                }else if(i==1){
                    Main.square[i][j] = new Square(new Soldier("Black"));
                    Main.square[i][j].setColor("Black");
                    Main.square[i][j].setLocation(i, j);
                    imageViews.setImage(Main.square[i][j].piecePhoto);
                } else if ((i == 0 && j == 0) || (i == 0 && j == 7)) {
                    Main.square[i][j] = new Square(new Rook("Black"));
                    Main.square[i][j].setLocation(i, j);
                    imageViews.setImage(Main.square[i][j].piecePhoto);
                }else if((i == 7 && j == 0) || (i == 7 && j == 7)){
                    Main.square[i][j] = new Square(new Rook("White"));
                    Main.square[i][j].setLocation(i, j);
                    imageViews.setImage(Main.square[i][j].piecePhoto);
                }
                else if ((i == 0 && j == 1) || (i == 0 && j == 6)  ) {
                    Main.square[i][j] = new Square(new Knight("Black"));
                    Main.square[i][j].setLocation(i, j);
                    imageViews.setImage(Main.square[i][j].piecePhoto);
                }else if((i == 7 && j == 1) || (i == 7 && j == 6)){
                    Main.square[i][j] = new Square(new Knight("White"));
                    Main.square[i][j].setLocation(i, j);
                    imageViews.setImage(Main.square[i][j].piecePhoto);
                } else if ((i == 0 && j == 2) || (i == 0 && j == 5)) {
                    Main.square[i][j] = new Square(new Bishop("Black"));
                    Main.square[i][j].setLocation(i, j);
                    imageViews.setImage(Main.square[i][j].piecePhoto);
                }else if( (i == 7 && j == 2) || (i == 7 && j == 5)){
                    Main.square[i][j] = new Square(new Bishop("White"));
                    Main.square[i][j].setLocation(i, j);
                    imageViews.setImage(Main.square[i][j].piecePhoto);
                }
                else if ((i == 0 && j == 4)) {
                    Main.square[i][j] = new Square(new King("Black"));
                    Main.square[i][j].setLocation(i, j);
                    imageViews.setImage(Main.square[i][j].piecePhoto);
                }else if((i == 7 && j == 4)){
                    Main.square[i][j] = new Square(new King("White"));
                    Main.square[i][j].setLocation(i, j);
                    imageViews.setImage(Main.square[i][j].piecePhoto);
                } else if ((i == 0 && j == 3) ) {
                    Main.square[i][j] = new Square(new Queen("Black"));
                    Main.square[i][j].setLocation(i, j);
                    imageViews.setImage(Main.square[i][j].piecePhoto);
                }else if( (i == 7 && j == 3)){
                    Main.square[i][j] = new Square(new Queen("White"));
                    Main.square[i][j].setLocation(i, j);
                    imageViews.setImage(Main.square[i][j].piecePhoto);
                }
                else {
                    Main.square[i][j] = new Square();
                    Main.square[i][j].setLocation(i, j);
                    imageViews.setImage(Main.square[i][j].piecePhoto);
                }

//                if ((i == 0) || (i == 1))
//                    Main.square[i][j].setColor("Black");
//                if ((i == 6) || (i == 7))
//                    Main.square[i][j].setColor("White");

//                imageViews.setOnMouseClicked(e->{
//                    Main.square[i][j].getLocationX();
//                    Main.square[i][j].getLocationY();
//                });

                grid.add(imageViews , j , i );

//        System.out.println("S");
//        for (int i = 0; i < 8 ; i++) {
//            Main.square[6][i] = new Square(new Soldier());
//            Main.square[6][i].setColor("White");
//            Main.square[6][i].setLocation(6 , i );
//            imageViews[6][i] = new ImageView(Main.square[6][i].pieces.file.toURI().toString());
//            System.out.println(Main.square[6][i].pieces.file.toURI().toString());
//            grid.add(imageViews[6][i] , 6 , i);
//        }
//        System.out.println("R");
//        Main.square[7][0] = new Square(new Rook());
//        Main.square[7][0].setColor("White");
//        Main.square[7][0].setLocation(7 , 0 );
//        imageViews[7][0] = new ImageView(Main.square[7][0].pieces.file.toURI().toString());
//        System.out.println(Main.square[7][0].pieces.file.toURI().toString());
//        grid.add(imageViews[7][0] , 7 , 0);
//
//        System.out.println("Q");
//        Main.square[7][0] = new Square(new Queen());
//        Main.square[7][0].setColor("White");
//        Main.square[7][0].setLocation(7 , 0 );
//        imageViews[7][0] = new ImageView(Main.square[7][0].pieces.file.toURI().toString());
//        System.out.println(Main.square[7][0].pieces.file.toURI().toString());
//        grid.getChildren().add(imageViews[7][0]);
////        grid.add(imageViews[7][0] , 7 , 0);
//
//        System.out.println("Q");
//        Main.square[7][0] = new Square(new King());
//        Main.square[7][0].setColor("White");
//        Main.square[7][0].setLocation(7 , 0 );
//        imageViews[7][0] = new ImageView(Main.square[7][0].pieces.file.toURI().toString());
//        System.out.println(Main.square[7][0].pieces.file.toURI().toString());
//    }

            }

        }
    }
}
