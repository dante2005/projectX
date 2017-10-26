package HomeTask4;

import java.io.*;

// 1. Method - Authenticate users by Login in system
//**************************************************

public class InMemoryPermissionService implements PermissionService{

    private final UserStorage userStorage;

    public InMemoryPermissionService(UserStorage userStorage) throws IOException{
        this.userStorage = userStorage;
    }

    @Override
    public boolean authenticate(User user) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String login = reader.readLine();

        if(userStorage.findByLogin(login) == null){
            return false;
        } else {
            LocalStorage.getInstance().setLoggedUser(user);
            System.out.println("You are in System.");
            return  true;
        }
    }

    public UserStorage getUserStorage() {
        return userStorage;
    }
}
