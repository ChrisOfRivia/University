package Ex2;

public class Ex2 {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A3", "Red", 200, "Diesel", "Neznam", 2007);
        Car car2 = new Car("Honda", "A3", "Red", 200, "Diesel", "Neznam", 2007);
        Car car3 = car1;
        Car car4 = new Car("Ford", "A3", "Red", 200, "Diesel", "Neznam", 2007);
        Car car5 = new Car("BMW", "A3", "Red", 200, "Diesel", "Neznam", 2007);

        Car[] cars = {car1, car2, car3, car4, car5};


        Car[] new_cars = car1.get_cars_with_char(cars, 'a');
        if (new_cars != null){
            for(int i = 0; i < new_cars.length; i++){
                System.out.println(new_cars[i].make);
            }
        }

        System.out.println("------ \n");

        Car[] sorted_cars = car1.get_sorted_car_list(cars, "alpha");
        for(int i = 0; i < sorted_cars.length; i++){
            System.out.println(sorted_cars[i].make);
        }

        System.out.println(" ------ \n");

        Car[] duplicate_cars = car1.remove_duplicates(cars);
        for(int i = 0; i < duplicate_cars.length; i++){
            System.out.println(duplicate_cars[i].make);
        }
    }

}
