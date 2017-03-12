package practic_3.view;

import practic_3.controller.MenuControlImpl;

import java.util.Scanner;

/**
 * Created by SergLion on 26.01.2017.
 */
public class MenuView {

    private MenuControlImpl menuControl = new MenuControlImpl();

    private Scanner scanner = new Scanner(System.in);

    public void start() {

        while (true) {

            showMainMenu();

            System.out.println("Do choice (number to work or different symbol to stop)");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                doChoice(num);

            } else {
                System.out.println("The program has been stopped");
                System.exit(0);
            }

        }

        }

    public void doChoice(int num) {
        if (num == 1) {
            menuControl.create();
        } else if (num == 2) {
            menuControl.signIn();
        } else {
            System.out.println("You entered uncorrect number");
        }
    }



    public void showMainMenu() {
        System.out.println("1. Create");
        System.out.println("2. Sign in");
    }



}
