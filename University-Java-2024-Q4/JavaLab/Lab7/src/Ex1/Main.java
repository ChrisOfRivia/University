package Ex1;

public class Main {
    public static void main(String[] args) {
        Train train = new Train();

        train.addWagon("Wagon 1");
        train.addWagon("Wagon 2");
        train.addWagon("Wagon 3");
        train.removeWagon();

        System.out.println(train.trainList);
    }
}
