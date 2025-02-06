package Ex1;

import java.util.ArrayList;

public class Planet extends OrbitableSpaceObject{
    ArrayList<BaseBuilding> buildings;
    double metal;
    double gas;
    double crystal;
    double uranium;

    Planet(String name, double coordinateX, double coordinateY, double coordinateZ, double mass, double metal, double gas, double crystal, double uranium) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
        this.metal = metal;
        this.gas = gas;
        this.crystal = crystal;
        this.uranium = uranium;
    }

    public double getMetal() {
        return metal;
    }

    public void setMetal(double metal) {
        this.metal = metal;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getCrystal() {
        return crystal;
    }

    public void setCrystal(double crystal) {
        this.crystal = crystal;
    }

    public double getUranium() {
        return uranium;
    }

    public void setUranium(double uranium) {
        this.uranium = uranium;
    }

    public void harvestMetal(){

    }

    public void harvestGas(){

    }

    public void harvestCrystal(){

    }

    public void harvestUranium(){

    }

    public void printResources(){
        System.out.println("Metal -> "+this.metal);
        System.out.println("Gas -> "+this.gas);
        System.out.println("Crystal -> "+this.crystal);
        System.out.println("Uranium -> "+this.uranium);
    }

    public void addBuilding(BaseBuilding building){
        this.buildings.add(building);
    }

    public void createBuilding(){

    }


}
