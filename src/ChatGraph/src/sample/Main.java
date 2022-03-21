package ChatGraph.src.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main extends Application {
    static sample.ChatEngine chatEngine ;
    static Scanner in ;
    static sample.Sender sender ;
    static sample.Receiver receiver ;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("board.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 972, 603));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        try{
            chatEngine = new sample.ChatEngine("localhost" , 8080);
//            in = new Scanner(System.in);
//            Sender sender = new Sender(chatEngine , in);
//            Receiver receiver = new Receiver(chatEngine);
//            sample.Receiver receiver = new sample.Receiver(chatEngine);

//            receiver.start();
//            sender.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
