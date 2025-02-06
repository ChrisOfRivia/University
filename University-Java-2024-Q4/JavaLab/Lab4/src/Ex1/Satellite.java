package Ex1;

public class Satellite extends SpaceObject implements Orbiter{
    Satellite(String name, double coordinateX, double coordinateY, double coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
    }

    @Override
    public void orbit(SpaceObject target) throws NotValidSpaceObjectException {
        if (!(target instanceof Planet)) {
            throw new NotValidSpaceObjectException("Space Objects can only orbit Planets!");
        }
    }
}
