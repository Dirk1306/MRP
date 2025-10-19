package service;

import model.MediaGame;
import model.MediaMovie;
import model.UserModel;

public interface IMediaMovieService {
    boolean createMedia(MediaMovie media);
    boolean updateMedia(MediaMovie media, UserModel user, String content);
    boolean deleteMedia(MediaMovie media, UserModel user);
}
