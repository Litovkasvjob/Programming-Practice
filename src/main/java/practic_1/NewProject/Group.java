package practic_1.NewProject;

/**
 * Created by student on 11/1/2016.
 */
public class Group {

    private String name;

    private int course;
    private String faculty;

    public Group(String name, int course, String faculty) {
        this.name = name;
        this.course = course;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
