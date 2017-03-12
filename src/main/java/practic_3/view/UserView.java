package practic_3.view;

import practic_3.controller.UserControlImpl;
import practic_3.model.User;

import java.util.Scanner;

/**
 * Created by SergLion on 26.01.2017.
 */
public class UserView {

    private UserControlImpl userControl = new UserControlImpl();
    private Scanner scanner = new Scanner(System.in);

    private boolean flag = false;

    public boolean showUserMenu(User user) { // id to identify User

        while (true) {
            System.out.println("1. Show films");
            System.out.println("2. Show sessions");
            System.out.println("3. Show halls");
            System.out.println("4. Show places");
            System.out.println("5. Back");
            System.out.println();
            System.out.println("Input number of menu");


            int number = 0;
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            }

            if (number == 5) break;

            flag = userControl.logicUser(number, user);

        }

        return flag;

    }

}
