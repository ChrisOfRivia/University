package Example;

import java.sql.SQLOutput;

public class Test {

    interface Printable {
        void print(String s);
    }

    public static void main(String[] args) {

//        Car car = new Car(Car.FuelType.DIESEL);


        //Anonymous class
//        Printable p = new Printable() {
//            @Override
//            public void print() {
//                System.out.println("Hello!!");
//            }
//        };

        //Shorter method for anonymous class
        Printable pe = (s) -> System.out.println(s);

        printPrintable(pe);
    }

    private static void printPrintable(Printable p) {
        p.print("Hello!!!");
    }
}
