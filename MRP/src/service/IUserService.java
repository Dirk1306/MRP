package service;

import model.UserModel;

public interface IUserService {

    boolean login(String  username, String password);
    boolean register(String username, String password);
    boolean checkLoggedIn(UserModel user);
}
