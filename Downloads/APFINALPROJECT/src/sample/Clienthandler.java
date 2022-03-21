package sample;

import java.io.*;
import java.net.Socket;
import java.util.Map;

public class Clienthandler implements Runnable {
    ObjectOutputStream oos;
    ObjectInputStream ois;
    Socket socket;

    public Clienthandler(Socket socket,ObjectInputStream ois,ObjectOutputStream oos) {
        this.socket = socket;
        this.ois = ois;
        this.oos = oos;
    }

    @Override
    public void run() {
        try{
            if(this.ois.readUTF().equals("signup")){

                users temp ;
                temp = (users) this.ois.readObject();
                if(checkUsername(temp)) {

                }else{
                    addProfile(temp);
                    this.oos.writeUTF("true");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean checkUsername(users profile){ // baraye check krdn vojood username ham nam ... !
        for (Map.Entry< String, users > entry : Server.profile.entrySet() ){
            if(entry.getValue().getUsername().equals(profile.getUsername()))
                return true ;
        }
        return false ;
    }

    public void addProfile(users profile){ // baraye ezafe krdn PRofile
        Server.profile.put(profile.getUsername() , profile);
        LoadUser.saveUsers();
//        Server.id ++ ;
    }
}
