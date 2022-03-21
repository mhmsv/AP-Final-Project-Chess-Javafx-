package sample;

import javafx.scene.image.Image;

import javax.swing.text.html.ImageView;
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
    Square(Soldier pieces) {
        this.pieces = pieces;
        if (pieces.color.equals("White")) {
            try {
                this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\White_Pawn.png").getPath()));
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        }else{
            try {
                this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\black_Pawn.png").getPath()));
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        }
    }
    Square(Rook pieces) {
        this.pieces = pieces;
        if (pieces.color.equals("White")) {
            try {
                this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\White_Rook.png").getPath()));
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        } else {
            try {
                this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\Black_Rook.png").getPath()));
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        }
    }
    Square(Knight pieces){
        this.pieces = pieces;
        if (pieces.color.equals("White")) {
            try {
                this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\White_Knight.png").getPath()));
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        }else{
            try {
                this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\Black_Knight.png").getPath()));
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        }
    }
        Square(Bishop pieces){
            this.pieces = pieces;
            if (pieces.color.equals("White")) {
                try {
                    this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\White_Bishop.png").getPath()));
                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }
            }else{
                try {
                    this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\Black_Bishop.png").getPath()));
                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }
            }
    }
    Square(King pieces){
        this.pieces = pieces;
        if (pieces.color.equals("White")) {
            try {
                this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\White_King.png").getPath()));
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        }else{
            try {
                this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\Black_King.png").getPath()));
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        }
    }
    Square(Queen pieces){
        this.pieces = pieces;
        if (pieces.color.equals("White")) {
            try {
                this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\White_Queen.png").getPath()));
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        }else{
            try {
                this.piecePhoto = new Image(new FileInputStream(new File("src\\sample\\Black_Queen.png").getPath()));
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        }new javafx.scene.image.Image(pieces.file.toURI().toString());
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
