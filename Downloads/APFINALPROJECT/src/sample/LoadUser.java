package sample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoadUser {
    public static List<users> readData() {
        ObjectInputStream objectInputStream;

        try {
            FileInputStream file = new FileInputStream("users.txt");
            objectInputStream = new ObjectInputStream(file);
            Main.users = ((ArrayList<users>) objectInputStream.readObject());
            return Main.users;

        } catch (Exception e) {
            System.out.println(e);
        }
        return Main.users;
    }

    public static void saveUsers(){
        try {
            FileOutputStream file = new FileOutputStream("user.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
            objectOutputStream.writeObject(Main.users);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
