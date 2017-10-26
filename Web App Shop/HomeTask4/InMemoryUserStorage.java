package HomeTask4;

import java.lang.*;
import java.util.*;

//***********************************************************
// 1. Method - Create Login for field of user.login
// 2. Method - Create ID for field of user.id
// 3. Method - Increase an array length
// 3. Method - Add user with all fields into array of users
// 4. Method - Remove users with params
// 5. Method - Print an array of all users
//***********************************************************
public class InMemoryUserStorage extends AbstractUserStorage {

    private User[] users;
    private int counter = 1;
    private long idTemp = 1;

    public InMemoryUserStorage() {
    }

    {
        users = new User[3];
    }

    public InMemoryUserStorage(User[] users) {
        this.users = users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    @Override
    public User[] getUsers() {
        return users;
    }

    public String createLogin(String name, String lastName) {
        String login = "Default";
        if(name.length() < 3 || lastName.length() < 3) {
            login = name.substring(0, name.length()) + lastName.substring(0, lastName.length());
            while(login.length() < 6){
                login += name.substring(0, 1);
                if(login.length() == 6){
                    break;
                }
                login += lastName.substring(0, 1);
            }
        } else {
            login = name.substring(0, 3) + lastName.substring(0, 3);
        }

        for(int i = 0; i < users.length; i++) {
            if(users[i] != null) {
                if (users[i].getLogin().equals(login)) {
                    login = login.substring(0, login.length() - 1) + counter;
                    counter++;
                }
            }
        }
        return login;
    }

    public long createId() {
        return idTemp++;
    }

    // TEST METHOD only for myself  (Print various parameters)
    public void printArray() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null){
                break;
            }
            System.out.print(users[i].getId() + " " +users[i].getName() + " " + users[i].getLastName());
            System.out.print(" " + users[i].getLogin() + " " + users[i].getPassword() + "\n");
        }
        System.out.println();
    }

    public void increaseArray() {
        User[] oldArray = users;
        users = new User[(int)(users.length * 1.5)];
        System.arraycopy(oldArray,0,users,0,oldArray.length);
    }

    @Override
    public void addUser(String name, String lastName, String password) {

        String currentLogin=null;

        if (users[users.length - 1] != null) {
            increaseArray();
        }

        for (int i = 0; i < users.length; i++)
        {
            if(users[i] == (null)) {
                User user = new User();
                user.setName(name);
                user.setLastName(lastName);
                user.setPassword(password);
                user.setLogin(createLogin(name, lastName));
                user.setId(createId());
                users[i] = user;
                currentLogin = user.getLogin();
                break;
            }
        }
        System.out.println("New User just added!");
        System.out.println("Your Login is" + " " + currentLogin );
    }

    @Override
    public void removeUser(String login) {

        for (int i = 0; i < users.length; i++) {

            if(getUsers()[i].getLogin().equals(login)) {
                User[] newArray1 = new User[i];
                User[] newArray2 = new User[users.length - 1 - i];
                System.arraycopy(users,0,newArray1,0,newArray1.length);
                System.arraycopy(users,i+1,newArray2,0,newArray2.length);
                users = new User[users.length-1];
                System.arraycopy(newArray1, 0, users, 0, newArray1.length);
                System.arraycopy(newArray2, 0, users, newArray1.length, newArray2.length);
            }
        }
    }
}
