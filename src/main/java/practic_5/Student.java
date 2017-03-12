package practic_5;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by SergLion on 08.02.2017.
 */
@Data
public class Student implements Serializable{
    private String name;
    private String group;
    private int course;
    private static final long serialVersionUID = 145654654222L;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }
}
