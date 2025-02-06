//package Ex1;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Course course1 = null;
//
//        String action = " ";
//        while(true){
//            System.out.println("Add to course? Y/N");
//            action = sc.nextLine();
//
//            if(action.equals("N")){
//                System.out.println(.courses.toString());
//                break;
//            }
//
//            if(action.equals("Y")){
//                System.out.println("Enter name: ");
//                String name = sc.nextLine();
//
//                System.out.println("Enter 3 grades: ");
//                String[] strGrades = sc.nextLine().split(" ");
//                double[] numGrades = Arrays.stream(strGrades).mapToDouble(Double::parseDouble).toArray();
//
//                System.out.println("Course: M|I: ");
//                String choice = sc.nextLine();
//                if(choice.equals("M")){
//                    Maths maths = new Maths(name, numGrades);
//                    maths.addToCourse(maths);
//                } else if (choice.equals("I")) {
//                    Informatics informatics = new Informatics(name, numGrades);
//                    informatics.addToCourse(informatics);
//                }
//            }
//        }
//    }
//}
