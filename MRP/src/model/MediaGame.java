package model;

public class MediaGame extends MediaModel{

    private String platform;
    private String studio;


    public String getPlatform() {
        return platform;
    }

    public String getStudio() {
        return studio;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public MediaGame(String studio, String platform, String title, String desc, String release, String genre, int age, UserModel user) {
        super(title, desc, release, genre, age, user);
        this.studio = studio;
        this.platform = platform;
    }

}
