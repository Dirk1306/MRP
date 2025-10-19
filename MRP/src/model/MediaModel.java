package model;

import java.util.List;

public class MediaModel {

    private String title;   // title
    private String description; // description
    private String release; // release year
    private String genre;   // genre(s)
    private int age_restriction; // age-restriction
    private UserModel creator;
    private List<RatingModel> ratings;

    public MediaModel(String title, String desc, String release, String genre, int age, UserModel user){
        this.title = title;
        this.description = desc;
        this.release = release;
        this.genre = genre;
        this.age_restriction = age;
        this.creator = user;
    }

    public UserModel getCreator() {
        return creator;
    }

    public int getAge_restriction() {
        return age_restriction;
    }

    public String getGenre() {
        return genre;
    }

    public String getRelease() {
        return release;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAge_restriction(int age_restriction) {
        this.age_restriction = age_restriction;
    }

    public void setCreator(UserModel creator) {
        this.creator = creator;
    }

    public void setRatings(List<RatingModel> ratings) {
        this.ratings = ratings;
    }
}
