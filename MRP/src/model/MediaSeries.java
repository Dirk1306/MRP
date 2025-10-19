package model;

public class MediaSeries extends MediaModel{

    private int seasons;
    private int episodes;

    public MediaSeries(String seasons, String episodes, String title, String desc, String release, String genre, int age, UserModel user) {
        super(title, desc, release, genre, age, user);
        try {
            this.seasons = Integer.parseInt(seasons);
            this.episodes = Integer.parseInt(episodes);
        }catch(NumberFormatException e){
            System.out.println("Invalid number");
        }
    }
}
