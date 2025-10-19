package handler;

import model.MediaGame;
import model.UserModel;
import service.IMediaGameService;
import service.IUserService;

public class MediaGameHandler {

    private IUserService userService;
    private IMediaGameService mediaService;

    public MediaGameHandler(IMediaGameService mediaService, IUserService userService) {
        this.userService = userService;
        this.mediaService = mediaService;
    }

    public boolean createMedia(String studio, String platform, String title, String desc, String release, String genre, int age,UserModel user) {
        if(userService.checkLoggedIn(user)){
            MediaGame media = new MediaGame(studio , platform, title, desc, release, genre, age, user);
            return mediaService.createMedia(media);
        }
        return false;
    }

    public boolean deleteMedia(UserModel user, MediaGame media){
        if(userService.checkLoggedIn(user)){
            return mediaService.deleteMedia(user, media);
        }
        return false;
    }

    public boolean updateMedia(UserModel user, MediaGame media, String newContent){
        if(userService.checkLoggedIn(user)){
            return mediaService.updateMedia(media, user, newContent);
        }
        return false;
    }


}
