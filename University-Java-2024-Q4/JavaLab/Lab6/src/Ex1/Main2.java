package Ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String action;
        while (true) {
            System.out.println("Add to course? Y/N");
            action = sc.nextLine();

            if (action.equalsIgnoreCase("N")) {
                if(!Informatics.informaticsStudents.isEmpty()) {
                    System.out.println("Course Informatics: ");
                    System.out.println(Informatics.informaticsStudents);
                }
                else{
                    System.out.println("No students were added to Informatics!");
                }
                if (!Maths.mathStudents.isEmpty()) {
                    System.out.println("Course Maths: ");
                    System.out.println(Maths.mathStudents);
                }
                else{
                    System.out.println("No students were added to Maths!!");
                }
                break;
            }

            if (action.equalsIgnoreCase("Y")) {
                System.out.println("Enter name: ");
                String name = sc.nextLine();

                System.out.println("Enter 3 grades: ");
                String[] strGrades = sc.nextLine().split(" ");
                double[] numGrades = Arrays.stream(strGrades).mapToDouble(Double::parseDouble).toArray();

                System.out.println("Course: M|I: ");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("M")) {
                    Maths maths = new Maths(name, numGrades);
                    maths.addToCourse(maths);

                } else if (choice.equalsIgnoreCase("I")) {
                    Informatics informatics = new Informatics(name, numGrades);
                    informatics.addToCourse(informatics);
                }
            }
        }
        sc.close();
    }
}