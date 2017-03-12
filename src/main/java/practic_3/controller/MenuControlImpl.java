package practic_3.controller;

import practic_3.model.Admin;
import practic_3.model.Cinema;
import practic_3.model.User;
import practic_3.view.AdminView;
import practic_3.view.UserView;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by SergLion on 26.01.2017.
 */
public class MenuControlImpl {

    private AdminControlImpl adminControl = new AdminControlImpl();
    private UserControlImpl userControl = new UserControlImpl();
    private AdminView adminView = new AdminView();
    private Cinema cinema = Cinema.getCinema();
    private UserView userView = new UserView();


    private Scanner scanner = new Scanner(System.in);


    public boolean create() {

        System.out.println("Input number of Type:");
        System.out.println("1 - admin");
        System.out.println("2 - user");

        boolean flag = false;

        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i == 1) {
                flag = adminControl.createAdmin();
            } else if (i == 2) {
                flag = userControl.createUser();
            }
        }

        return flag;
    }

    public boolean signIn() {

        System.out.println("Input number of Type:");
        System.out.println("1 - Admin");
        System.out.println("2 - User");

        boolean flag = false;

        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i == 1) {

                System.out.println("Enter Admin login ");
                if (scanner.hasNext()) {
                    String login = scanner.next();
                    if (login.equals(cinema.getAdmin().getLogin())) {
                        System.out.println("Enter password");
                        String password = scanner.next();
                        if (password.equals(cinema.getAdmin().getPassword())) {
                            flag = adminView.showAdminMenu();                   // Admin menu
                        } else {
                            System.out.println("You set uncorrect password");
                        }

                    } else {
                        System.out.println("You set uncorrect login");
                    }
                }


            } else if (i == 2) {

                System.out.println("Enter User login");
                if (scanner.hasNext()) {
                    String login = scanner.next();
                    for (User user : cinema.getListUsers()) {
                        if (user.getLogin().equals(login)) {
                            System.out.println("Enter password");
                            String password = scanner.next();
                            if (user.getPassword().equals(password)) {
                                flag = userView.showUserMenu(user); // user menu
                                break;
                            }
                        } else {
                            System.out.println("You set uncorrect password");
                        }
                    }
                } else {
                    System.out.println("You set uncorrect login");
                }
            }
        }
        return flag;
    }


}
