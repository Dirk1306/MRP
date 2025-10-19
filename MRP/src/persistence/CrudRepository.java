package persistence;

import model.MediaModel;
import model.UserModel;

public abstract class CrudRepository<T extends MediaModel> {

    public abstract boolean createMedia(T model);

    public abstract boolean updateMedia(T model, UserModel user, String content);

    public abstract boolean deleteMedia(T model, UserModel user);
}
