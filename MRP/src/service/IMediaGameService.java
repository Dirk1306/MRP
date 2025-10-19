package service;

import model.MediaGame;
import model.MediaModel;
import model.UserModel;

public interface IMediaGameService{
    boolean createMedia(MediaGame media);
    boolean updateMedia(MediaGame mediaGame, UserModel user, String content);
    boolean deleteMedia(UserModel user, MediaGame media);
}
