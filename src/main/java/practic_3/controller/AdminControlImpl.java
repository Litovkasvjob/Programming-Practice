package practic_3.controller;

import practic_3.model.Admin;
import practic_3.model.Cinema;

import java.util.Scanner;

/**
 * Created by SergLion on 26.01.2017.
 */


public class AdminControlImpl implements AdminController {

    private Scanner scanner = new Scanner(System.in);


    /**
     * Create Admin
     *
     * @return true if user is created
     */

    @Override
    public boolean createAdmin() {

        Admin admin;
        String login = null;
        String password = null;
        boolean flag = false;

        System.out.println("Enter the login of Admin");
        if (scanner.hasNext()) {
            login = scanner.next();
        } else {
            System.out.println("You entered uncorrect symbol");
        }

        System.out.println("Enter the password of Admin");
        if (scanner.hasNext()) {
            password = scanner.next();
        } else {
            System.out.println("You entered uncorrect symbol");
        }

        if (login.length() > 0) {
            if (Cinema.getCinema().getAdmin() == null) {
                admin = new Admin(login, password);
                Cinema.getCinema().setAdmin(admin);
                System.out.println("Admin is created");
                flag = true;
            } else {
                System.out.println("Admin has been existed");
            }
        } else {
            System.out.println("The User is not created, repeat again");
        }

        return flag;
    }
}
