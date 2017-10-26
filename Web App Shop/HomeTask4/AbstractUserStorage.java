package HomeTask4;

//***************************************************
// 1.Method - Find user by inputing Login
// 2.Method - Find user by iputing Name ans Lastname
//***************************************************
public abstract class AbstractUserStorage implements UserStorage {

    @Override
    public User findByLogin(String login){

        User[] users = getUsers();

        for(User savedUser : users){
            if(savedUser == null){
                System.out.println("No such User!");
                break;
            }
            if (savedUser.getLogin().equals(login)) {
                return savedUser;
            }

        }
        // Можно ли заменить вышеприведенный вариант, который мы на уроке
        // использовалипоиска юзера по логину на нижних два ???
        // 1. Вариант
        /*for(User savedUser : getUsers()){
            if (savedUser.getLogin().equals(login)) {
                return savedUser;
            }
        }
        // 2. Вариант (этот для меня более понятен пока)
        for(int i = 0; i < getUsers().length; i++){
            if(getUsers()[i].getLogin().equals(login)){
                return  getUsers()[i];
            }
        }*/
        return  null;
    }

    @Override
    public User findByNameAndLastName(String name, String lastName) {

        User [] users = getUsers();

        for(User user : users) {
            if (user.getName().equals(name) && user.getLastName().equals(lastName)){
                return  user;
            }
        }
        // Ну и соответственно:
        // Можно ли заменить вышеприведенный вариант, который мы на уроке
        // использовалипоиска юзера по логину на нижних два ???
        // 1. Вариант
        /*
        for(User ourUser : getUsers()) {
            if(ourUser.getLastName().equals(name) && ourUser.getLastName().equals(lastName)) {
                return ourUser;
            }
        }

        // 2. Вариант
        for(int i = 0; i < getUsers().length; i++) {
            if (getUsers()[i].getName().equals(name) && getUsers()[i].getLastName().equals(lastName)) {
                return getUsers()[i];
            }
        }*/
        return  null;
    }
}
