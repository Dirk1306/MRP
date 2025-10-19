package persistence;

import model.MediaGame;
import model.UserModel;
import java.util.List;

public class MediaGameRepository extends CrudRepository<MediaGame> {

    private List<MediaGame> mediaListe;

    private static MediaGameRepository instance = new MediaGameRepository();
    public static MediaGameRepository getInstance(){
        return instance;
    }

    public boolean createMedia(MediaGame media) {
        // add to DB
        return mediaListe.add(media);
    }

    public boolean deleteMedia(MediaGame media, UserModel user) {
        return mediaListe.remove(media);
    }

    public boolean updateMedia(MediaGame media, UserModel user,  String newContent) {
        //SQL query
        return false;
    }


}
