import java.util.Scanner;

public class Task1 {

    public static void printIntroduction(){
        System.out.println("This is a BMI calculator!");
    }

    public static double bmiFor(double height, double weight){
        return (weight * 703) / (height * height);

    }

    public static String getStatus(double bmi){
        if (bmi < 18.5){
            return "underweight";
        }
        else if(bmi < 25){
            return "normal";
        }
        else if(bmi < 30){
            return "overweight";
        }
        else if (bmi > 30){
            return "obese";
        }
        else {
            return "Unvalid bmi";
        }
    }

    public static void reportResults(int[] num, double bmi, String status){
        num[0]++;
        bmi = Math.round(bmi);
        System.out.printf("BMI Results: \n Number: %d\n BMI: %.2f\n Status: %s \n", num[0], bmi, status);
    }

    public static double getBMI(Scanner sc){
        System.out.print("Please enter height in inches: ");
        double height_in = sc.nextDouble();
        System.out.print("Please enter weight in pounds: ");
        double weight_pound = sc.nextDouble();
        sc.close();

        double height_cm = height_in * 2.54;
        double weight_kg = weight_pound / 2.2046;

        return bmiFor(height_cm, weight_kg);
    }


    public static void main(String[] args) {
        int[] number = new int[1];
        number[0] = 0;
        printIntroduction();
        Scanner sc = new Scanner(System.in);
        double bmi = getBMI(sc);
        String result = getStatus(bmi);
        reportResults(number, bmi, result);

    }
}
