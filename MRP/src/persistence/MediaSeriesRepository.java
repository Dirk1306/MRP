package persistence;

import model.MediaMovie;
import model.MediaSeries;
import model.UserModel;

import java.util.List;

public class MediaSeriesRepository extends CrudRepository<MediaSeries>{
    private List<MediaSeries> mediaListe;

    private static MediaMovieRepository instance = new MediaMovieRepository();
    public static MediaMovieRepository getInstance(){
        return instance;
    }

    public boolean createMedia(MediaSeries media) {
        // add to DB
        return mediaListe.add(media);
    }

    public boolean deleteMedia(MediaSeries media, UserModel user) {
        return mediaListe.remove(media);
    }

    public boolean updateMedia(MediaSeries media, UserModel user,  String newContent) {
        //SQL query
        return false;
    }
}
