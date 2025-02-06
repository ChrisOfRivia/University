package Ex1;

import java.util.ArrayList;
import java.util.List;

public abstract class OrbitableSpaceObject extends SpaceObject{
    ArrayList <SpaceObject> orbiters;

    OrbitableSpaceObject(String name, double coordinateX, double coordinateY, double coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
    }

    public void addOrbiter(SpaceObject orbiter, ArrayList<SpaceObject> list){
        list.add(orbiter);
    }

    public void getOrbiters(){

    }
}


