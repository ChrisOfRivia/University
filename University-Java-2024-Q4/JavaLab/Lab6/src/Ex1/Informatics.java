package Ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class Informatics extends Course {
    protected static ArrayList<Informatics> informaticsStudents = new ArrayList<>();

    public Informatics(String studentName, double[] grades) {
        super(studentName, grades);
    }

    @Override
    public void addToCourse(Course course) {
        if(informaticsStudents.size() == 5){
            System.out.println("Cannot add more students! Limit is 5!");
        }
        else{
            informaticsStudents.add((Informatics) course);
        }
    }

    @Override
    public String toString() {

        StringBuilder finalMessage = new StringBuilder();
        for (int i = 1; i <= informaticsStudents.size(); i++) {
            finalMessage.append("Student [").append(i).append("]: ").append(informaticsStudents.get(i - 1).studentName).append(", Grades: ").append(Arrays.toString(informaticsStudents.get(i - 1).grades)).append("\n");
        }

        return finalMessage.toString().trim();
    }
}
