package sample;
import javafx.scene.image.Image;

import java.io.Serializable;

public class users implements Serializable {
private String username;
    String imagePath ;
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

//    public Image getProfilepicture() {
//        return profilepicture;
//    }

//    public void setProfilepicture(Image profilepicture) {
//        this.profilepicture = profilepicture;
//    }
    public String getImagePath() {
        return imagePath;
    }
    public users(String username, String name, int rank, String imagePath, String password) {
        this.username = username;
        this.name = name;
        this.rank = rank;
        this.imagePath = imagePath;
        this.password = password;
    }
    users(){

    }

    private String name;
private  int rank;
// private Image profilepicture;



    }

