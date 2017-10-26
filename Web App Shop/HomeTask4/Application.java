package HomeTask4;

import java.lang.*;
import java.util.*;
import java.io.*;

public class Application {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InMemoryUserStorage newUser = new InMemoryUserStorage();
        InMemoryPermissionService newService = new InMemoryPermissionService(newUser);
        User user = new User();
/*
        // Manual test for Array if needed
        newUser.addUser("Tim1", "Furtuk1", "12qwre");
        newUser.addUser("Adam2", "Mart2", "12qwre");
        newUser.addUser("Adam2", "Mart2", "12qwre");
        newUser.printArray();
        //newUser.removeUser("AdaMar");

        newUser.addUser("Omar6", "Teen6", "12qwre");
        newUser.addUser("Omar6", "Teen6", "12qwre");
        newUser.printArray();
*/
        Boolean notExit = true;

        while(notExit) {
            System.out.println("\nHello, please input you parameters!");
            System.out.println("Login:  ");
            if (newService.authenticate(user)) {
                System.out.println("Delete User = 1    View all User(admin) = 2   Exit = 3 \nChoose:");
                String choice = reader.readLine();
                if (choice.equals("1")) {
                    System.out.println("Print login: ");
                    String login = reader.readLine();
                    newUser.removeUser(login);
                } else if (choice.equals("2")) {
                    newUser.printArray();
                } else if(choice.equals("3")){
                    System.out.println("Have a nice day!");
                    notExit = false;
                }

            } else {
                System.out.println("Add User = 1     Exit = 2 \nChoose: ");
                String name, lastName, password;
                String choice = reader.readLine();
                if (choice.equals("1")) {
                    System.out.println("Type your Name: ");
                    name = reader.readLine();
                    System.out.println("Type your Lastname: ");
                    lastName = reader.readLine();
                    System.out.println("Type your Password: ");
                    password = reader.readLine();
                    newUser.addUser(name, lastName, password);
                }
                if (choice.equals("2")) {
                    System.out.println("Have a nice day!");
                    notExit = false;
                }
            }
        }
    }
}
