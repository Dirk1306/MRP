package service;

import model.MediaSeries;
import model.UserModel;

public interface IMediaSeriesService {
    boolean createMedia(MediaSeries media);
    boolean updateMedia(MediaSeries media, UserModel user, String content);
    boolean deleteMedia(MediaSeries media, UserModel user);
}
