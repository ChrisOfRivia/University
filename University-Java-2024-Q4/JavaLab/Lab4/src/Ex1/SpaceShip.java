package Ex1;

public class SpaceShip implements Fly{
    String type;
    double speed;
    double cargoCapacity;
    double weaponPower;

    public SpaceShip(String type, double speed, double cargoCapacity, double weaponPower) {
        this.type = type;
        this.speed = speed;
        this.cargoCapacity = cargoCapacity;
        this.weaponPower = weaponPower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public double getWeaponPower() {
        return weaponPower;
    }

    public void setWeaponPower(double weaponPower) {
        this.weaponPower = weaponPower;
    }

    public void travel(){

    }

    public void harvestResource(){

    }

    public void attack(){

    }
}
