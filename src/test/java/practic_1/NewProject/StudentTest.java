package practic_1.NewProject;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Created by student on 11/1/2016.
 */
public class StudentTest {

    Student student;
    ArrayList<Exam> examArrayList = new ArrayList<Exam>();

    @Before
    public void setUp() throws Exception {

        Group group = new Group("42", 4, "TRT");
        Exam exam1 = new Exam("qwe", 3, 2016, 1);
        Exam exam2 = new Exam("rty", 4, 2015, 2);
        Exam exam3 = new Exam("rty", 4, 2015, 2);
        Exam exam4 = new Exam("rty", 4, 2015, 2);
        Exam exam5 = new Exam("dfg", 5, 2015, 2);
        Exam exam6 = new Exam("dfg", 5, 2015, 2);
        Exam exam7 = new Exam("qwe", 3, 2016, 1);


        examArrayList.add(exam1);
        examArrayList.add(exam2);
        examArrayList.add(exam3);
        examArrayList.add(exam4);
        examArrayList.add(exam5);
        examArrayList.add(exam6);
        examArrayList.add(exam7);


        student = new Student("Pety", "Vasyl", group, examArrayList);

    }

    @After
    public void dataClear() {
        examArrayList.clear();
    }

    @Test
    public void testMaxGrade() throws Exception {
        Assert.assertEquals(4, student.maxGrade("rty"));
    }

    @Test
    public void  testDeleteGrade() {
        Assert.assertTrue(true == student.deleteGradeExam(3, "qwe"));
    }

    @Test
    public void testAddGrade() {
        Assert.assertTrue(true == student.addGradeExam(5, "rty"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testExcepion() {
        Assert.assertTrue(true == student.deleteGradeExam(2, "yyy"));
    }

    @Test
    public void testNumber() {
        Assert.assertEquals(3, student.numberOfExamWithGrade(4));
    }

    @Test
    public void testMiddleGrade() {
        System.out.println(student.minddleGradeForSemestre(1));
        System.out.println(student.minddleGradeForSemestre(2));
        Assert.assertEquals(3, student.minddleGradeForSemestre(1), 0.00001);
    }




}



