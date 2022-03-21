package sample;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ChatTest implements Runnable {
    private Set<Client> clients = ConcurrentHashMap.newKeySet();

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket s;
            while (true) {
                s = serverSocket.accept();
                Client client = new Client(s, this);
                clients.add(client);
                client.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ChatTest().run();
    }

    public synchronized void sendToAll(String msg, Client sender) {
        System.out.println(sender.name + ": " + msg);
        for (Client client : clients) {
            if (client == sender) continue;
            client.sendMessage(msg);
        }
    }

    public void remove(Client client) {
        clients.remove(client);
    }

    public void restart() {
        for (Client client : clients) {
            client.close();
            remove(client);
        }
    }

}

class Client extends Thread {
    private final Scanner input;
    private final PrintStream output;
    private Socket socket;
    String name = "UnKnown";
    private ChatTest server;
    private volatile boolean isClosed = false;

    public Client(Socket s, ChatTest t) throws IOException {
        socket = s;
        output = new PrintStream(socket.getOutputStream());
        input = new Scanner(socket.getInputStream());
        server = t;
    }

    @Override
    public void run() {
        name = input.nextLine();
        server.sendToAll(name + " Joined", this);
        try {
            while (true) {
                server.sendToAll(name + ": " + readMessage(), this);
            }
        } catch (NoSuchElementException e) {
            if (!isClosed) {
                server.sendToAll(name + " Left", this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String msg) {
        synchronized (output) {
            output.println(msg);
            output.flush();
        }
    }

    public String readMessage() {
        synchronized (input) {
            return input.nextLine();
        }
    }

    public void close() {
        try {
            socket.close();
            isClosed = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}