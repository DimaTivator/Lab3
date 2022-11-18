package valeObjects;

public class Fly extends Insect {

    public Fly(double sizeX, double sizeY, double sizeZ) {
        setSizeX(sizeX);
        setSizeY(sizeY);
        setSizeZ(sizeZ);
        System.out.println("Муха создана");
    }

    public Fly() {
        System.out.println("Муха со стандартными размерами создана");
    }


    @Override
    public void setSizeX(double sizeX) {
        super.setSizeX(Math.min(Math.max(sizeX, 0), 5));
    }

    @Override
    public void setSizeY(double sizeY) {
        super.setSizeY(Math.min(Math.max(sizeY, 0), 5));
    }

    @Override
    public void setSizeZ(double sizeZ) {
        super.setSizeZ(Math.min(Math.max(sizeZ, 0), 5));
    }

    @Override
    public void setEnergyPoints(double energyPoints) {
        super.setEnergyPoints(Math.min(Math.max(energyPoints, 0), 100));
    }


    // the value of buzzing volume (from 1 to 5)
    private int buzzingVolume = 3;

    public int getBuzzingVolume() {
        return buzzingVolume;
    }

    public void setBuzzingVolume(int buzzingVolume) {
        this.buzzingVolume = Math.min(Math.max(buzzingVolume, 0), 5);
    }

    private boolean checkEnergyPoints() {
        return getEnergyPoints() > 50;
    }

    /**
     * Count of "Bzz" depends on value of the buzzingVolume
     */
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


    /**
     * Fly flies if it has enough energy.
     */
    @Override
    public void fly() {
        if (checkEnergyPoints()) {
            System.out.println("Муха летает! Bzz Bzz Bzz");
        } else {
            System.out.println("У мухи нет сил летать :(");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fly fly = (Fly) obj;
        return hashCode() == fly.hashCode();
    }

    @Override
    public int hashCode() {
        return ((int) (getSizeX() * 17667049) % 3797191 % 8923) * ((int) (getSizeY() * 17667049) % 3797191 % 8923) * ((int) (getSizeZ() * 17667049) % 3797191 % 8923);
    }

    @Override
    public String toString() {
        return "Муха";
    }
}
