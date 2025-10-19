package handler;

import model.MediaSeries;
import model.UserModel;
import service.IMediaSeriesService;
import service.IUserService;

public class MediaSeriesHandler {
    private IUserService userService;
    private IMediaSeriesService mediaService;

    public MediaSeriesHandler(IMediaSeriesService mediaService, IUserService userService) {
        this.userService = userService;
        this.mediaService = mediaService;
    }

    public boolean createMedia(String seasons, String episodes, String title, String desc, String release, String genre, int age, UserModel user) {
        if(userService.checkLoggedIn(user)){
            MediaSeries media = new MediaSeries(seasons, episodes, title, desc, release, genre, age, user);
            return mediaService.createMedia(media);
        }
        return false;
    }

    public boolean deleteMedia(UserModel user, MediaSeries media){
        if(userService.checkLoggedIn(user)){
            return mediaService.deleteMedia(media, user);
        }
        return false;
    }

    public boolean updateMedia(UserModel user, MediaSeries media, String newContent){
        if(userService.checkLoggedIn(user)){
            return mediaService.updateMedia(media, user, newContent);
        }
        return false;
    }
}
