package Ex1;

public class Star extends OrbitableSpaceObject implements Orbiter{
    Star(String name, double coordinateX, double coordinateY, double coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
    }

    @Override
    public void orbit(SpaceObject target) throws NotValidSpaceObjectException {
        if(!(target instanceof Planet)){
            throw new NotValidSpaceObjectException("Space Objects can only orbit Planets!");
        }
    }
}
