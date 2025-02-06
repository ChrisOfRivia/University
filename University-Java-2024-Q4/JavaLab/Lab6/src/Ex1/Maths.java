package Ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class Maths extends Course {
    protected static ArrayList<Maths> mathStudents = new ArrayList<>();

    public Maths(String studentName, double[] grades) {
        super(studentName, grades);
    }

    @Override
    public void addToCourse(Course course) {
        if(mathStudents.size() == 5){
            System.out.println("Cannot add more students to Maths! Limit: 5");
        }
        else{
            mathStudents.add((Maths) course);
        }
    }

    @Override
    public String toString() {

        StringBuilder finalMessage = new StringBuilder();
        for (int i = 1; i <= mathStudents.size(); i++) {
            finalMessage.append("Student [").append(i).append("]: ").append(mathStudents.get(i - 1).studentName).append(", Grades: ").append(Arrays.toString(mathStudents.get(i - 1).grades)).append("\n");
        }

        return finalMessage.toString().trim();
    }
}
