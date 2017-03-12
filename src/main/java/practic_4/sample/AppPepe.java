package practic_4.sample;

import java.util.Scanner;

/**
 * Created by SergLion on 03.02.2017.
 */
public class AppPepe {
    public static void main(String[] args) {

        CollPepe collPepe = new CollPepe();
        Pepe pepe1 = new Pepe("Rttt", 19);
        Pepe pepe2 = new Pepe("Ddfgd", 20);
        Pepe pepe3 = new Pepe("Asaf", 21);
        Pepe pepe4 = new Pepe("Gsdfsd", 35);

        collPepe.getPepeList().add(pepe1);
        collPepe.getPepeList().add(pepe2);
        collPepe.getPepeList().add(pepe3);
        collPepe.getPepeList().add(pepe4);



    }
}
