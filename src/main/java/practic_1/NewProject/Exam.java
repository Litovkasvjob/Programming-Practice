package practic_1.NewProject;

/**
 * Created by student on 11/1/2016.
 */
public class Exam {
    private String nameExam;
    private int grade;
    private int year;
    private int semester;

    public Exam(String nameExam, int grade) {
        this.nameExam = nameExam;
        this.grade = grade;
    }

    public Exam(String nameExam, int grade, int year, int semester) {
        this.nameExam = nameExam;
        this.grade = grade;
        this.year = year;
        this.semester = semester;
    }

    public String getNameExam() {
        return nameExam;
    }

    public void setNameExam(String nameExam) {
        this.nameExam = nameExam;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
