package sample;

import javafx.scene.image.Image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Soldier extends Pieces {

    Soldier(String color) {
        name = "S";
        this.color = color ;
        if(color.equals("White")){
            file = new File("White_Pawn.png");
        }else {
            file = new File("black_Pawn.png");
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
    }
}
