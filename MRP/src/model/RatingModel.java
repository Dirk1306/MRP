package model;

import java.util.List;

public class RatingModel {

    private UserModel user;
    private MediaModel media;
    private int value;
    private List<UserModel> userList;
    private boolean visible;
    private String timestamp;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public void setMedia(MediaModel media) {
        this.media = media;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setUserList(List<UserModel> userList) {
        this.userList = userList;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public MediaModel getMedia() {
        return media;
    }

    public int getValue() {
        return value;
    }

    public List<UserModel> getUserList() {
        return userList;
    }

    public boolean isVisible() {
        return visible;
    }
}
