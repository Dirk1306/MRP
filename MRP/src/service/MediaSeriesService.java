package service;

import model.MediaSeries;
import model.UserModel;
import persistence.MediaSeriesRepository;

public class MediaSeriesService extends CrudService<MediaSeries> implements IMediaSeriesService{

    private static MediaSeriesService instance = null;
    private MediaSeriesRepository crudRepository;

    private MediaSeriesService(MediaSeriesRepository crudRepository) {
        super(crudRepository);
        this.crudRepository = crudRepository;
    }

    public static MediaSeriesService getInstance(MediaSeriesRepository crudRepository) {
        if (instance == null) {
            instance = new MediaSeriesService(crudRepository);
        }
        return instance;
    };

    @Override
    public boolean createMedia(MediaSeries media) {
        return false;
    }

    @Override
    public boolean updateMedia(MediaSeries media, UserModel user, String content) {
        return false;
    }

    @Override
    public boolean deleteMedia(MediaSeries media, UserModel user) {
        return false;
    }
}
