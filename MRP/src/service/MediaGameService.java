package service;

import model.MediaGame;
import model.UserModel;
import persistence.MediaGameRepository;

public class MediaGameService extends CrudService<MediaGame> implements IMediaGameService {

    private static MediaGameService instance = null;
    private MediaGameRepository crudRepository;

    private MediaGameService(MediaGameRepository crudRepository) {
        super(crudRepository);
        this.crudRepository = crudRepository;
    }

    public static MediaGameService getInstance(MediaGameRepository crudRepository) {
        if (instance == null) {
            instance = new MediaGameService(crudRepository);
        }
        return instance;
    };

    @Override
    public boolean createMedia(MediaGame model) {
        return crudRepository.createMedia(model);
    }

    @Override
    public boolean updateMedia(MediaGame media, UserModel user, String newContent) {
        return crudRepository.updateMedia(media, user, newContent);
    }

    @Override
    public boolean deleteMedia(UserModel user, MediaGame media) {
        return crudRepository.deleteMedia(media, user);
    }


}
