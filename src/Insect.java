public abstract class Insect {

    // field contains the value of fly's energy (value from 0 to 100)
    private double energyPoints;

    public double getEnergyPoints() {
        return energyPoints;
    }

    public void setEnergyPoints(double energyPoints) {
        this.energyPoints = energyPoints;
    }

    // sizes of fly in 3 dimensions: x, y, z (values from 1 to 10 millimetres)
    private double sizeX;
    private double sizeY;
    private double sizeZ;

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
