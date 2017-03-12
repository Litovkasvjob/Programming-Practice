package practic_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SergLion on 30.01.2017.
 */
public class App {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        Student student1 = new Student("Serg", "Litovka", 3);
        Student student2 = new Student("Anna", "Wertff", 2);
        Student student3 = new Student("Pety", "Sdfghdg", 2);
        Student student4 = new Student("Vasy", "cnhgjc", 3);
        Student student5 = new Student("Dima", "dsfgsdfg", 1);
        Student student6 = new Student("Oleg", "dfgsdfgsdf", 3);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);

        //System.out.println(list.toString());

        for (Student student : list) {
            System.out.println(student.toString());
        }

        System.out.println(StudentUtils.createMapFromList(list));
        System.out.println();
        StudentUtils.printStudents(list, 3);
        System.out.println();

        System.out.println(StudentUtils.sortStudents(list));


        String text = WordCounter.parseString("src/main/resources/text.txt", "utf-8");
        System.out.println(text);

      // WordCounter.splitString(text);
        System.out.println();

        WordCounter.splitString("src/main/resources/text.txt", WordCounter.Direction.RIGHT );
        System.out.println();
        WordCounter.splitString("src/main/resources/text.txt", WordCounter.Direction.DOWN );
        System.out.println();
        WordCounter.splitString("src/main/resources/text.txt", WordCounter.Direction.FREQUENCY_RIGHT);
        System.out.println();
        WordCounter.splitString("src/main/resources/text.txt", WordCounter.Direction.FREQUENCY_DOWN );


    }
}
