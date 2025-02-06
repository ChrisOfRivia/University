package Ex10;

import java.util.LinkedList;
import java.util.List;

public class BusRoute {
    List<String> busRoutes = new LinkedList<>();

    public void addStop(String stop){
        this.busRoutes.add(stop);
    }

    public String getNextStop(){
        String firstStop = this.busRoutes.getFirst();
        this.busRoutes.removeFirst();
        return firstStop;
    }
}
