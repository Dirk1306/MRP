package persistence;

import model.UserModel;

public interface IUserRepository {
    boolean login(String  username, String password);
    boolean register(String username, String password);
}
