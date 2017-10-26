package HomeTask4;

public interface UserStorage {

    User findByLogin(String login);

    User findByNameAndLastName(String name, String lastName);

    void removeUser(String login);

    void addUser(String name, String lastName, String password);

    User[] getUsers();
}
