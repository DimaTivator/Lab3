package valeObjects;


public abstract class Insect extends ValeObject {

    private double maxEnergyPointsValue = 100;

    public void setMaxEnergyPointsValue(double value) {
        maxEnergyPointsValue = value;
    }

    public double getMaxEnergyPointsValue() {
        return maxEnergyPointsValue;
    }

    // the value of fly's energy (from 0 to maxEnergyPointsValue)
    private double energyPoints = 50;

    public double getEnergyPoints() {
        return energyPoints;
    }

    public void setEnergyPoints(double energyPoints) {
        this.energyPoints = Math.min(Math.max(energyPoints, 0), getMaxEnergyPointsValue());
    }

    // sizes of fly in 3 dimensions: x, y, z
    private double sizeX = 1;
    private double sizeY = 1;
    private double sizeZ = 1;

    public double getSizeX() {
        return sizeX;
    }

    public void setSizeX(double sizeX) {
        this.sizeX = sizeX;
    }

    public double getSizeY() {
        return sizeY;
    }

    public void setSizeY(double sizeY) {
        this.sizeY = sizeY;
    }

    public double getSizeZ() {
        return sizeZ;
    }

    public void setSizeZ(double sizeZ) {
        this.sizeZ = sizeZ;
    }

    abstract void makeSound();

    abstract void fly();
}
