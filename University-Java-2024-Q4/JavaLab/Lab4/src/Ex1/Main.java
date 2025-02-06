package Ex1;

public class Main {
    public static void main(String[] args) throws NotValidSpaceObjectException {
        Planet planet = new Planet("Jupiter", 200.5, 200, 500, 20000, 50, 20, 30, 40);
        Planet planet2 = new Planet("Uranus", 200, 200, 200, 200, 200, 200, 200, 200);
        Satellite satellite = new Satellite("Satellite 1", 2000, 200, 200, 200);
        Satellite satellite2 = new Satellite("Satellite 2", 2000, 200, 200, 200);

        try {
            satellite.orbit(planet2);
        }catch (NotValidSpaceObjectException e){
            System.out.println(e.getMessage());
        }
    }
}
