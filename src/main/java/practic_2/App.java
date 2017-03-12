package practic_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SergLion on 20.01.2017.
 */
public class App {

    public static void main(String[] args) {



        String text = Parser.parseString("src/main/resources/baby2008.html" , "utf-8");
        //System.out.println(text);
        List list = Parser.parseRating(text);
        list.forEach(System.out::println);

        //System.out.println(list.toString());
    }
}

class AppLaptop {

    public static void main(String[] args) {
        String text = Parser.parseString("src/main/resources/source.html" , "windows-1251");
       // System.out.println(text);
        List list = Parser.parseLaptop(text);
        list.forEach(System.out::println);
    }
}
