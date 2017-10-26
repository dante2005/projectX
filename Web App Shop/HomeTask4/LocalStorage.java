package HomeTask4;

public class LocalStorage {

    private User loggedUser;
    private static  LocalStorage instance = new LocalStorage();

    private LocalStorage() {
        System.out.println("LOGGED USER");
    }

    public static LocalStorage getInstance(){
        return instance;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }
}
