package mummiValeObjects;

import enums.Type;

public class Fly extends Insect {

    public Fly(double sizeX, double sizeY, double sizeZ) {
        System.out.println("Муха создана");
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
        type = Type.OBJECT;
    }

    private final Type type;

    public Type getType() {
        return type;
    }

    // sizes of fly in 3 dimensions: x, y, z (values from 1 to 5 millimetres)
    private double sizeX;
    private double sizeY;
    private double sizeZ;

    @Override
    public void setSizeX(double sizeX) {
        this.sizeX = Math.min(Math.max(sizeX, 0), 5);
    }

    @Override
    public void setSizeY(double sizeY) {
        this.sizeY = Math.min(Math.max(sizeY, 0), 5);
    }

    @Override
    public void setSizeZ(double sizeZ) {
        this.sizeZ = Math.min(Math.max(sizeZ, 0), 5);
    }

    // the value of fly's energy (from 0 to 100)
    private double energyPoints;

    @Override
    public void setEnergyPoints(double energyPoints) {
        this.energyPoints = Math.min(Math.max(energyPoints, 0), 100);
    }

    // the value of buzzing volume (from 1 to 5)
    private int buzzingVolume;

    public int getBuzzingVolume() {
        return buzzingVolume;
    }

    public void setBuzzingVolume(int buzzingVolume) {
        this.buzzingVolume = Math.min(Math.max(buzzingVolume, 0), 5);
    }

    private boolean checkEnergyPoints() {
        return energyPoints > 50;
    }

    @Override
    public void makeSound() {
        if (checkEnergyPoints()) {
            for (int i = 0; i < buzzingVolume; i++) {
                System.out.print("Bzz ");
            }
            System.out.println();
        } else {
            System.out.println("У мухи нет сил жужжать :(");
        }
    }

    @Override
    public void fly() {
        if (checkEnergyPoints()) {
            System.out.println("Муха летает! Bzz Bzz Bzz");
        } else {
            System.out.println("У мухи нет сил летать :(");
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        // let the flies be equal if they have simple hash codes
        Fly fly = (Fly) object;
        return hashCode() == fly.hashCode();
    }

    @Override
    public int hashCode() {
        return ((int) (sizeX * 17667049) % 3797191) * ((int) (sizeY * 17667049) % 3797191) * ((int) (sizeZ * 17667049) % 3797191);
    }
}
