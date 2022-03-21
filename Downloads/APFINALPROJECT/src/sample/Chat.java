package sample;

import sample.ChatEngine;

import javax.sound.midi.Receiver;
import java.io.IOException;
import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        try{
            ChatEngine chatEngine = new ChatEngine("localhost" , 8080);
            Scanner cin = new Scanner(System.in);
            sample.Sender sender = new sample.Sender(chatEngine , cin);
//            Receiver receiver = new Receiver(chatEngine);
            sample.Receiver receiver = new sample.Receiver(chatEngine);

            receiver.start();
            sender.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
