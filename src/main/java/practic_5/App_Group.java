package practic_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SergLion on 08.02.2017.
 */
public class App_Group {
    public static void main(String[] args) {

        Student student1 = new Student("Dery", "2G", 2);
        Student student2 = new Student("Dery", "2G", 2);
        Student student3 = new Student("Dery", "2G", 2);
        Student student4 = new Student("Dery", "2G", 2);

        Group group = new Group();
        group.add(student1);
        group.add(student2);
        group.add(student3);
        group.add(student4);

        group.getStudentList().forEach(System.out::println);
        System.out.println();
        saveObject("group.data", group);
        restoreObjects("group.data").forEach(System.out::println);


    }

    public static void saveObject(String path, Object... objects) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            for (Object object : objects) {
                oos.writeObject(object);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List restoreObjects(String path) {
        List list = new ArrayList();
        Object object = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            while ((object = ois.readObject()) != null) {
                list.add(object);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return list;
    }
}
