package model;

public class MediaMovie extends MediaModel{

    private String length;

    public MediaMovie(String length, String title, String desc, String release, String genre, int age, UserModel user) {
        super(title, desc, release, genre, age, user);
        this.length = length;
    }

}
