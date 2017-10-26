package HomeTask4;

// *************************
// Keep params of class User
// *************************

public class User {

    private long id;
    private String login;
    private String name;
    private String lastName;
    private String password;

    public User(long id, String login, String name, String lastName, String password) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return  true;
        if(!(obj instanceof User)) return false;

        User other = (User)obj;

        return id == other.id && ((name != null) && (name.equals(other.name))) &&
                ((lastName != null) && (lastName.equals(other.lastName))) &&
                ((login!= null) && (login.equals(other.login))) &&
                ((password != null) && (password.equals(other.password)));
    }

    @Override
    public int hashCode() {
        int result = 5;
        // As option ! Doesn't work if printing!!!
        //result = 31 * result + new Long(id).hashCode();

        result = 31 * result + new Long(id).hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}


