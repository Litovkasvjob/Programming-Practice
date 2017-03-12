package practic_4;

import java.util.*;

/**
 * Created by SergLion on 30.01.2017.
 */
public class StudentUtils {



    public static Map<String, Student> createMapFromList(List<Student> students) {

        Map<String, Student> map = new HashMap<>();
        for (Student student : students) {
            map.put(student.getFirstName() + " " + student.getLastName(), student);
        }
        return map;
    }

    public static void printStudents(List<Student> students, int course) {

        for (Iterator iter = students.iterator(); iter.hasNext(); ) {
            Student student = (Student) iter.next();
            if (student.getCourse() == course) {
                System.out.println(student.getFirstName() + " " +student.getLastName());
            }
        }
    }

    public static List<Student> sortStudents(List<Student> students) {
        List<Student> list = new ArrayList<>();
        list.addAll(students);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }

        });

        return list;

    }


}
