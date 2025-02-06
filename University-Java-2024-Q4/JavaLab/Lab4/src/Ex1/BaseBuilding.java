package Ex1;

public class BaseBuilding {
    String name;
    int level;
    int constructionTime;
    double metalRequired;
    double crystalRequired;
    double gasRequired;
    double uraniumRequired;

    public BaseBuilding(String name, int level, int constructionTime, double metalRequired, double crystalRequired, double gasRequired, double uraniumRequired) {
        this.name = name;
        this.level = level;
        this.constructionTime = constructionTime;
        this.metalRequired = metalRequired;
        this.crystalRequired = crystalRequired;
        this.gasRequired = gasRequired;
        this.uraniumRequired = uraniumRequired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getConstructionTime() {
        return constructionTime;
    }

    public void setConstructionTime(int constructionTime) {
        this.constructionTime = constructionTime;
    }

    public double getMetalRequired() {
        return metalRequired;
    }

    public void setMetalRequired(double metalRequired) {
        this.metalRequired = metalRequired;
    }

    public double getCrystalRequired() {
        return crystalRequired;
    }

    public void setCrystalRequired(double crystalRequired) {
        this.crystalRequired = crystalRequired;
    }

    public double getGasRequired() {
        return gasRequired;
    }

    public void setGasRequired(double gasRequired) {
        this.gasRequired = gasRequired;
    }

    public double getUraniumRequired() {
        return uraniumRequired;
    }

    public void setUraniumRequired(double uraniumRequired) {
        this.uraniumRequired = uraniumRequired;
    }

    public void construct(Planet target){

    }

    public void upgrade(){

    }

    public void applyEffect(){

    }
}
