package practic_1.NewProject;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Created by student on 11/1/2016.
 */
public class Student {

    private String name;
    private String surname;
    private Group group;
    private ArrayList<Exam> exams = new ArrayList<Exam>();

    public Student(String name, String surname, Group group, ArrayList<Exam> exams) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.exams = exams;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public ArrayList<Exam> getExams() {
        return exams;
    }

    public void setExams(ArrayList<Exam> exams) {
        this.exams = exams;
    }

    public int maxGrade(String exam) {

        int max = 0;
        for (Exam exam1 : getExams()) {
            if (exam1.getNameExam().equals(exam)) {
                if (exam1.getGrade() > max) {
                    max = exam1.getGrade();
            }

            }
        }

        return max;
    }

    public boolean addGradeExam(int grade, String name) {
        boolean flag = false;
        Exam exam = new Exam(name, grade);

        return  getExams().add(exam);
    }

    public boolean deleteGradeExam(int grade, String name) {

        boolean flag = false;

        int notExam = 0;
        for (Exam exam1 : getExams()) {
            if (exam1.getNameExam().equals(name)) {
                if (exam1.getGrade() == grade) {
                    flag = getExams().remove(exam1);
                    notExam++;
                    break;
                }

            }
        }

        if (notExam == 0) {
            throw new NoSuchElementException("There is not such exam");
        }

        return flag;
    }

    public int numberOfExamWithGrade(int grade) {
        int number = 0;

        for (Exam exam : getExams()) {
            if (exam.getGrade() == grade) {
                number++;
            }
        }
        return number;
    }

    public double minddleGradeForSemestre(int semester) {

        double middleGrade = 0;
        int numberOfExam = 0;


        for (Exam exam : getExams()) {

            if (exam.getSemester() == semester) {
                numberOfExam++;
                middleGrade += exam.getGrade();
            }

        }

        if (numberOfExam != 0) {
            middleGrade = middleGrade / numberOfExam;
        }

        return middleGrade;
    }


}
