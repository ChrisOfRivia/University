package Ex10;

public class Main {
    public static void main(String[] args) {
        BusRoute br = new BusRoute();

        br.addStop("Stop 1");
        br.addStop("Stop 2");
        br.addStop("Stop 3");

        System.out.println(br.getNextStop());
        System.out.println(br.getNextStop());
        System.out.println(br.getNextStop());
        System.out.println(br.busRoutes);
    }
}
