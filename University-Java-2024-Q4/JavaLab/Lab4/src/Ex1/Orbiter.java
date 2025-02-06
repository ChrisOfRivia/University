package Ex1;

public interface Orbiter {
    default void orbit(SpaceObject target) throws NotValidSpaceObjectException{
        if(!(target instanceof Planet)){
            throw new NotValidSpaceObjectException("Space Objects can only orbit Planets!");
        }
    }
}
