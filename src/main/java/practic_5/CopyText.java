package practic_5;

import org.openjdk.jmh.annotations.*;

import java.io.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by SergLion on 04.02.2017.
 */

public class CopyText {

    public static void main(String[] args) {
        CopyText nes = new CopyText();
        nes.CopyWrite("text4.txt", "repeat.txt");
        nes.bufferedCopyWrite("text4.txt", "repeat.txt");
    }



    public void CopyWrite(String fromFile, String toFile) {

        long start = System.currentTimeMillis();

        File file = new File(toFile);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        StringBuilder sb = new StringBuilder();

        try (FileReader fileReader = new FileReader(fromFile);
             FileWriter fileWriter = new FileWriter(toFile)) {
            int i = -1;
            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }

            fileWriter.write(sb.toString());




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long finish = System.nanoTime() - start;
        System.out.println(finish);

    }


    public void bufferedCopyWrite(String fromFile, String toFile) {

        long start = System.currentTimeMillis();

        File file = new File(toFile);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        StringBuilder sb = new StringBuilder();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fromFile));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(toFile))) {
            int i = -1;
            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }

            fileWriter.write(sb.toString());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long finish = System.nanoTime() - start;
        System.out.println(finish);

    }


}
