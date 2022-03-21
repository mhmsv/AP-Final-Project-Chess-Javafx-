package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Scanner;

public class Controller extends Thread {
    @FXML
    TextField text ;
    @FXML
    Button send ;



    public void setSend(){
        String name = text.getText();
        Main.in = new Scanner(name);
        Main.sender = new Sender(Main.chatEngine , Main.in);
        Main.receiver = new sample.Receiver(Main.chatEngine);

//        Main.receiver.start();
//        Main.sender.start();
    }
}
