package sample;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Server implements Serializable {
    public static ArrayList<Clienthandler> clients = new ArrayList<Clienthandler>();
    static Map<String, users> profile = new HashMap<String, users>();
    ObjectOutputStream oos;
    ObjectInputStream ois;
    Socket socket;

//8195...

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8195);

        while ( true ) {
            Socket currentSocket = serverSocket.accept();
            ObjectInputStream ois = new ObjectInputStream( currentSocket.getInputStream() );
            ObjectOutputStream oos = new ObjectOutputStream( currentSocket.getOutputStream() );
            Clienthandler currentClientHandler = new Clienthandler( currentSocket, ois, oos );

            Thread test = new Thread( currentClientHandler );
            test.start();


        }
    }
}
