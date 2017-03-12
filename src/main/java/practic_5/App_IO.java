package practic_5;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SergLion on 03.02.2017.
 */
public class App_IO {
    public static void main(String[] args) {

        int size = 1000;
        Random random = new Random(size);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(random.nextInt(size) + " ");
        }
        fillFile(sb.toString(), "testPractic5.txt");

        System.out.println(readAndSortFile("testPractic5.txt"));
        fillFile(readAndSortFile("testPractic5.txt"), "test2.txt");

        rating("test3.txt");
        System.out.println();

        replaceWords("text4.txt");
        System.out.println();
        replaceWords2("text4.txt");

        //CopyText.CopyWrite("text4.txt", "repeat.txt");


    }

    public static void fillFile(String text, String fileName) {

        File file = new File(fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try ( BufferedWriter br = new BufferedWriter(new FileWriter(file))){
           br.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readAndSortFile(String fileName) {



        String str = readFile(fileName);
        String[] strings = str.split(" ");

        List<Integer> list = new ArrayList();
        for (String string : strings) {
            list.add(Integer.parseInt(string));
        }

        list.sort((o1, o2) -> o1 - o2);

        StringBuilder sb2 = new StringBuilder();
        for (Integer integer : list) {
            sb2.append(integer.intValue() + " ");
        }

        return sb2.toString();


    }

    public static String readFile(String fileName) {


        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            int i = -1;
            while ((i = br.read()) != -1) {

                sb.append((char) i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();

    }




    public static void rating(String fileName) {

        List<Student> studentList = new ArrayList<>();

        String str = readFile(fileName);
        System.out.println(str);
        Pattern pattern = Pattern.compile("(?<lastName>\\W+) (?<firstName>\\W+)=(?<rating>[0-9 ]+)");

        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String lastName = matcher.group("lastName");
            String firstName = matcher.group("firstName");
            String rating = matcher.group("rating");

            String[] strings = rating.split(" ");

            List<Integer> list = new ArrayList();
            for (String string : strings) {
                list.add(Integer.parseInt(string));
            }

            Student student = new Student(lastName, firstName, list);
            studentList.add(student);
        }

        for (Student student : studentList) {
            double rs = 0;
            int rt = 0;
            for (Integer integer : student.getRating()) {
                rt += integer;
            }
            rs = (double) rt / student.getRating().size();


            if (rs >= 3) {
                System.out.printf("%1$s %2$s = %3$.2f", student.getLastName(), student.getFirstName(), rs);
            }
        }


    }



    static class Student {
        @Getter @Setter
        private String lastName;
        @Getter @Setter
        private String firstName;
        @Getter @Setter
        private List<Integer> rating;

        public Student(String lastName, String firstName, List<Integer> rating) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.rating = rating;
        }
    }

    public static void replaceWords(String fileName) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] lines = line.split(" ");

                String d = line.replaceAll(lines[lines.length - 1], lines[0]);

                System.out.println(d.replaceFirst(lines[0], lines[lines.length - 1]));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void replaceWords2(String fileName) {

        String str = readFile(fileName);
        Pattern pattern = Pattern.compile("[А-я 0-9,:;\"]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {

            String d = matcher.group();
            String r = d.trim();

            String[] lines = r.split("[,\\s]+");

            String ww = r.replaceAll(lines[lines.length - 1], lines[0]);

            System.out.println(ww.replaceFirst(lines[0], lines[lines.length - 1]));
        }
    }








}
