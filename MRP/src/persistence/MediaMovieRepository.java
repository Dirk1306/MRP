package persistence;

import model.MediaGame;
import model.MediaMovie;
import model.UserModel;

import java.util.List;

public class MediaMovieRepository extends CrudRepository<MediaMovie> {
    private List<MediaMovie> mediaListe;

    private static MediaMovieRepository instance = new MediaMovieRepository();
    public static MediaMovieRepository getInstance(){
        return instance;
    }

    public boolean createMedia(MediaMovie media) {
        // add to DB
        return mediaListe.add(media);
    }

    public boolean deleteMedia(MediaMovie media, UserModel user) {
        return mediaListe.remove(media);
    }

    public boolean updateMedia(MediaMovie media, UserModel user,  String newContent) {
        //SQL query
        return false;
    }
}
