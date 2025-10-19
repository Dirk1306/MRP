package handler;

import model.MediaGame;
import model.MediaMovie;
import model.UserModel;
import service.IMediaGameService;
import service.IMediaMovieService;
import service.IUserService;

public class MediaMovieHandler {
    private IUserService userService;
    private IMediaMovieService mediaService;

    public MediaMovieHandler(IMediaMovieService mediaService, IUserService userService) {
        this.userService = userService;
        this.mediaService = mediaService;
    }

    public boolean createMedia(String length, String title, String desc, String release, String genre, int age, UserModel user) {
        if(userService.checkLoggedIn(user)){
            MediaMovie media = new MediaMovie(length, title, desc, release, genre, age, user);
            return mediaService.createMedia(media);
        }
        return false;
    }

    public boolean deleteMedia(UserModel user, MediaMovie media){
        if(userService.checkLoggedIn(user)){
            return mediaService.deleteMedia(media, user);
        }
        return false;
    }

    public boolean updateMedia(UserModel user, MediaMovie media, String newContent){
        if(userService.checkLoggedIn(user)){
            return mediaService.updateMedia(media, user, newContent);
        }
        return false;
    }
}
