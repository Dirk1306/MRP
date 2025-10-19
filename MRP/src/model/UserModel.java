package model;

import java.util.List;

public class UserModel {

    private String username;
    private final String password;
    private String email;
    private int id;
    private List<MediaModel> favorites;
    private List<RatingModel> ratings;

    public UserModel(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
       return this.password;
    }


}
