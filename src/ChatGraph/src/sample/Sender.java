package sample;

import sample.ChatEngine;

import java.util.Scanner;

public class Sender extends Thread{
    private ChatEngine engine ;
    private Scanner input ;

    public Sender(ChatEngine engine , Scanner cin){
        this.engine = engine ;
        this.input = cin ;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String msg = input.nextLine();
                if (msg.equals("Exit")) {
                    engine.close();
                    System.exit(0);
                }
                engine.sendMessage(msg);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
