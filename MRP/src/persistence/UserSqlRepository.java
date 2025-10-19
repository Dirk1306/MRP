package persistence;

import model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserSqlRepository implements IUserRepository {

    private static UserSqlRepository instance = new UserSqlRepository();
    public static UserSqlRepository getInstance(){
        return instance;
    }

    private List<UserModel> users = new ArrayList<UserModel>();

    private UserSqlRepository(){}

    public boolean login(String username, String password) {
        // UserModel user = new UserModel("admin", "password", "test@gmail.com");
        // users.add(user);
        for (UserModel userModel : users) {
            if(userModel.getUsername().equals(username)
                    && userModel.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean register(String username, String password) {
        if(login(username, password)){
            return false;
        }else {
            UserModel user = new UserModel(username, password);
            users.add(user);
            return true;
        }
    }


}
