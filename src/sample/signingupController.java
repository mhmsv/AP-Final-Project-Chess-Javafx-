package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;

public class signingupController {
    @FXML
    ImageView back, done, profilepic;
    @FXML
    Text alert, infoSaved;
    @FXML
    TextField name, username;
    @FXML
    PasswordField password;

    File file = new File("src/assets/Anonymous_Emoticon-01-512.png");

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

    public void done() throws IOException {
        Main.oos.writeUTF("signup");

        if (username.getText().isEmpty() || name.getText().isEmpty() || password.getText().isEmpty()) {
            alert.setVisible(true);

        }else if (!username.getText().isEmpty() && !name.getText().isEmpty() && !password.getText().isEmpty()) {
            alert.setVisible(false);
            String u_username = username.getText();
            String u_password = password.getText();
            String u_name = name.getText();
            Image u_profilepic = profilepic.getImage();

            users u = new users(username.getText(), name.getText(), 1200, profilepic.getImage().getUrl().toString(), password.getText());
            Main.oos.writeObject((users) u);

            if (Main.ois.readUTF().equals("true")) {
                infoSaved.setVisible(true);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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
        }
    }

    public void setProfilepic() {
        FileChooser fc = new FileChooser();
        file = fc.showOpenDialog(null);
        if (file != null) {
            Image image = new Image(file.getAbsoluteFile().toURI().toString());
            profilepic.setImage(image);
        }
    }
}

