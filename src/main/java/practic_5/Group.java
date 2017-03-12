package practic_5;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SergLion on 08.02.2017.
 */
@Data
public class Group implements Serializable{
    private List<Student> studentList;

    public Group() {
        this.studentList = new ArrayList<>();
    }

    public boolean add(Student student) {
      return   studentList.add(student);
    }

    public boolean delete(Student student) {
        boolean flag = false;
        for (Student student1 : studentList) {
            if (student1.getName().equals(student.getName())
                    & student1.getGroup().equals(student.getGroup())
                    & student1.getCourse() == student.getCourse()) {
                flag = studentList.remove(student);
                break;
            }
        }
        return flag;
    }



}
