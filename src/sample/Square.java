package sample;

import javafx.scene.image.Image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Square {
    Image piecePhoto ;
    Pieces pieces ;// Mohereha ... :D
    Square(){
        this.pieces = new Pieces() ;
        try {
            this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\Blank.png").getPath()));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
//        this.piecePhoto = new javafx.scene.image.Image(pieces.file.toURI().toString());
    }
    Square(Soldier pieces){
        this.pieces = pieces;
        try {
            this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\White_Pawn.png").getPath()));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
    Square(Rook pieces){
        this.pieces = pieces;
        try {
            this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\White_Rook.png").getPath()));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
//        this.piecePhoto = new javafx.scene.image.Image(pieces.file.toURI().toString());

    }
    Square(Knight pieces){
        this.pieces = pieces;
        try {
            this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\White_Knight.png").getPath()));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
//        this.piecePhoto = new javafx.scene.image.Image(pieces.file.toURI().toString());
    }
        Square(Bishop pieces){
            this.pieces = pieces;
            try {
                this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\White_Bishop.png").getPath()));
            }catch (FileNotFoundException e){
                System.out.println(e);
            }
//            this.piecePhoto = new javafx.scene.image.Image(pieces.file.toURI().toString());
    }
    Square(King pieces){
        this.pieces = pieces;
        try {
            this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\White_King.png").getPath()));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
//        this.piecePhoto = new javafx.scene.image.Image(pieces.file.toURI().toString());
    }
    Square(Queen pieces){
        this.pieces = pieces;
        try {
            this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\White_Queen.png").getPath()));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
//        this.piecePhoto = new javafx.scene.image.Image(pieces.file.toURI().toString());
    }
    //
    String getSquare(){
        return piecePhoto.toString() ;
    }

    void setLocation(int x , int y){
        pieces.setX(x);
        pieces.setY(y);
    }

    int getLocationX(){
        return pieces.x ;
    }
    int getLocationY(){
        return pieces.y ;
    }

    void setColor(String color){
        pieces.setColor(color);
    }

}
