package practic_3.controller;

import practic_3.model.Cinema;
import practic_3.model.User;

import java.util.Scanner;

/**
 * Created by SergLion on 26.01.2017.
 */
public class UserControlImpl implements UserController {

    private Cinema cinema = Cinema.getCinema();
    private Scanner scanner = new Scanner(System.in);
    private boolean flag = false;

    @Override
    public boolean logicUser(int number, User user) {
        System.out.println("3. Show halls");
        System.out.println("4. Show places");
        System.out.println("5. Select ticket");

        switch (number) {
            case 1: //Show films

                if (!cinema.getListFilms().isEmpty()) {
                    cinema.getListFilms().forEach(System.out::println);
                    flag = true;
                    break;
                } else {
                    System.out.println("There is not films yet");
                }
                break;
            case 2: // Show sessions

                if (!cinema.getListSessions().isEmpty()) {
                    cinema.getListSessions().forEach(System.out::println);
                    flag = true;
                    break;
                } else {
                    System.out.println("There is not session yet");
                }
                break;
            case 3: // Show halls


        }

        return flag;
    }

    /**
     * Create user and add to listUsers
     *
     * @return true if user is created
     */

    public boolean createUser() {

        User user;
        String login = null;
        String password = null;
        boolean flag = false;

        System.out.println("Enter the login of user");
        if (scanner.hasNext()) {
            login = scanner.next();
        } else {
            System.out.println("You entered uncorrect symbol");
        }

        System.out.println("Enter the password of user");
        if (scanner.hasNext()) {
            password = scanner.next();
        } else {
            System.out.println("You entered uncorrect symbol");
        }

        if (login.length() > 0) {

            user = new User(login, password);
            cinema.getListUsers().add(user);
            System.out.println("User is created and add to listUser");
            flag = true;
        } else {
            System.out.println("The User is not created, repeat again");
        }

        return flag;

    }
}
