package Example;

public class Main {
    public static void main(String[] args) {
        Area[] areas = new Area[2];
        areas[0] = new Rectangle(10, 10);
        areas[1] = new Circle(10);

        for(Area a: areas){
            metho(a);
        }

    }

    public static void metho(Area a){
        if (a instanceof Rectangle){
            Rectangle r = (Rectangle) a;
            System.out.println(r.getA());
        }
        System.out.println(a.calculateArea());
    }
}