package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;

public class signinginConroller {
    @FXML
    ImageView back, signin;
    @FXML
    TextField username;
    @FXML
    PasswordField passwrod;
    @FXML
    Text forgetalert, existalert;

    public void tomenu() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("startmenu.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene sc = new Scene(root);
        Main.ps.setScene(sc);
        Main.ps.show();
    }

    public void setSignin() {
        for (int i = 0; i < Main.users.size(); i++) {
            System.out.println(Main.users.size());
            System.out.println(i);
            LoadUser.readData();
            if (Main.users.get(i).getName().equals(username.getText()) && Main.users.get(i).getPassword().equals(passwrod.getText())) {
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("showingprofile.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene sc = new Scene(root);
                Main.ps.setScene(sc);
                Main.ps.show();
            }

        }
        existalert.setVisible(true);
        System.out.println("gashtam nabod nagard nis");
    }
}
