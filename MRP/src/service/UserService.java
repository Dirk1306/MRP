package service;

import model.UserModel;
import persistence.IUserRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserService implements IUserService {

    private static UserService instance = null;

    private IUserRepository userRepository;
    private Map<String, String> tokenListe = new HashMap<>();

    public Map<String, String> getTokenListe() {
        return tokenListe;
    }

    public String getUserToken(String username){
        if(tokenListe.containsKey(username)) {
            return tokenListe.get(username);
        }else{
            return null;
        }
    }

    private UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static UserService getInstance(IUserRepository userRepository) {
        if (instance == null) {
            instance = new UserService(userRepository);
        }
        return instance;
    }

    public boolean login(String username, String password) {
        if(userRepository.login(username, password)){
            if(!tokenListe.containsKey(username)) {
                tokenListe.put(username ,UUID.randomUUID().toString());
            }
            return true;
        }
        return false;
    }

    public boolean register(String username, String password){
        /*if(email.contains("@")){
            userRepository.register(username, password, email);
            return true;
        }*/
        return userRepository.register(username, password);
    }

    public boolean checkLoggedIn(UserModel user){
        if(getUserToken(user.getUsername()) != null){
            return true;
        }
        return false;
    }

}
