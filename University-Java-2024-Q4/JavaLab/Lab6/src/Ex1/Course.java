package Ex1;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Course {
    protected String studentName;
    protected double[] grades;
    protected static ArrayList<Course> courses = new ArrayList<>();

    public Course(String studentName, double[] grades) {
        this.studentName = studentName;
        this.grades = grades;
    }

    public abstract void addToCourse(Course course);

    @Override
    public String toString() {
        return "Name: " + studentName + ", Grades: " + Arrays.toString(grades);
    }
}


