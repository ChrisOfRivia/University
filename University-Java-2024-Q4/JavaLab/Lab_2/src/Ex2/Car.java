package Ex2;

import javax.lang.model.type.NullType;

public class Car {
    String make;
    String model;
    String colour;
    double power;
    String engine_type;
    String gearbox_type;
    int year_of_manufacture;

    Car(String make, String model, String colour, double power, String engine_type, String gearbox_type, int year_of_manufacture) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.power = power;
        this.engine_type = engine_type;
        this.gearbox_type = gearbox_type;
        this.year_of_manufacture = year_of_manufacture;
    }

    Car() {

    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String new_make) {
        this.make = new_make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String new_model) {
        this.model = new_model;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String new_colour) {
        this.colour = new_colour;
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double new_power) {
        this.power = new_power;
    }

    public String getEngine_type() {
        return this.engine_type;
    }

    public void setEngine_type(String new_engine_type) {
        this.engine_type = new_engine_type;
    }

    public String getGearbox_type() {
        return this.gearbox_type;
    }

    public void setGearbox_type(String new_gearbox_type) {
        this.gearbox_type = new_gearbox_type;
    }

    public int getYear_of_manufacture() {
        return this.year_of_manufacture;
    }

    public void setYear_of_manufacture(int new_year_of_manufacture) {
        this.year_of_manufacture = new_year_of_manufacture;
    }

    public Car[] get_cars_with_char(Car[] cars, char chr) {

        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].make.charAt(0) == Character.toUpperCase(chr)) {
                count++;
            }
        }
        Car[] new_cars = new Car[count];
        int counter = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].make.charAt(0) == Character.toUpperCase(chr)) {
                new_cars[counter] = cars[i];
                counter++;
            }
        }
        return new_cars;
    }

    public Car[] reverse(Car[] cars) {
        Car[] new_cars = new Car[cars.length];
        int counter = 0;
        for (int i = cars.length - 1; i > -1; i--) {
            new_cars[counter] = cars[i];
            counter++;
        }
        return new_cars;
    }

    public Car[] get_sorted_car_list(Car[] cars, String way) {
        Car temp_car = new Car();
        for (int j = 0; j < cars.length; j++) {
            for (int i = 0; i < cars.length - 1; i++) {
                if (cars[i].make.compareTo(cars[i + 1].make) > 0) {
                    temp_car = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp_car;
                }
            }
        }
        if (way == "alpha") {
            return cars;
        }
        return reverse(cars);
    }

    public Car[] remove_duplicates(Car[] cars) {
        Car[] new_cars = new Car[cars.length];
        int counter = 0;
        for (int i = 0; i < cars.length - 1; i++) {
            if (!cars[i].equals(cars[i + 1])) {
                new_cars[counter] = cars[i];
                counter++;
                if (i == cars.length - 2) {
                    new_cars[counter] = cars[cars.length - 1];
                }
            }
        }
        return new_cars;
    }
}