package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Optional;

public class Main extends Application {
    static ObjectOutputStream oos ;
    static ObjectInputStream ois ;
    static  DataOutputStream dos ;
    static DataInputStream dis ;
    static Socket socket ;
    public static void Close_Alert(javafx.stage.WindowEvent e) {
        Alert close = new Alert(Alert.AlertType.CONFIRMATION);
        close.setTitle("Exit?!");
        close.setHeaderText("Are You Sure You Want to Exit?");
        close.initModality(Modality.APPLICATION_MODAL);
        Optional<ButtonType> result = close.showAndWait();
        if (result.get() == ButtonType.OK) {
            System.exit(0);
        } else {
            e.consume();
        }
    }
    public  static  ArrayList<users> users = new ArrayList<users>();

    static Stage ps;
    @Override
    public void start(Stage primaryStage) throws Exception{
        ps = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("startmenu.fxml"));
        primaryStage.setTitle("Chess");
        Main.ps.setOnCloseRequest(e -> Main.Close_Alert(e));
        primaryStage.setScene(new Scene(root, 400, 600));
        primaryStage.show();
    }


    public static void main(String[] args) throws IOException {

        launch(args);
            socket = new Socket("localhost", 8195);
        ois = new java.io.ObjectInputStream(socket.getInputStream());
        oos = new ObjectOutputStream(socket.getOutputStream());
        dis = new DataInputStream(socket.getInputStream());
        dos = new DataOutputStream(socket.getOutputStream());
    }
}