package service;

import model.MediaMovie;
import model.UserModel;
import persistence.MediaMovieRepository;

public class MediaMovieService extends CrudService<MediaMovie> implements IMediaMovieService{

    private static MediaMovieService instance = null;
    private MediaMovieRepository crudRepository;

    private MediaMovieService(MediaMovieRepository crudRepository) {
        super(crudRepository);
        this.crudRepository = crudRepository;
    }

    public static MediaMovieService getInstance(MediaMovieRepository crudRepository) {
        if (instance == null) {
            instance = new MediaMovieService(crudRepository);
        }
        return instance;
    };

    @Override
    public boolean createMedia(MediaMovie media) {
        return false;
    }

    @Override
    public boolean updateMedia(MediaMovie mediaMovie, UserModel user, String content) {
        return false;
    }

    @Override
    public boolean deleteMedia(MediaMovie media, UserModel user) {
        return false;
    }
}
