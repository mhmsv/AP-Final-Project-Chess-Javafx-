package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

import java.io.IOException;


public class startmenuController {
    @FXML
    ImageView signin,signup;
    public void tosigninpage()
    {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("signingin.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene sc = new Scene(root);
        Main.ps.setScene(sc);
        Main.ps.show();
    }
    public void tosignuppage() throws IOException {
//        Main.oos.writeObject("signup");
         Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("signingup.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene sc = new Scene(root);
        Main.ps.setScene(sc);
        Main.ps.show();
    }
}
