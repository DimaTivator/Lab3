package valeInhabitants;

import abilities.AbleToSleep;
import dataStructures.Sizes;
import enums.Gender;
import locations.Cave;

import java.util.Objects;

public class Moomin implements AbleToSleep {

    private final String name;
    private final Gender gender;

    public Moomin(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    // sizes of mummiFamily friend in 3 dimensions: x, y, z
    public Sizes<Integer> sizes = new Sizes<>(10, 1, 1);

    public Moomin(String name, Gender gender, int sizeX, int sizeY, int sizeZ) {
        this.name = name;
        this.gender = gender;
        sizes.setSizeX(sizeX);
        sizes.setSizeY(sizeY);
        sizes.setSizeZ(sizeZ);
    }


    /**
     * method digs a pit on the cave on the first at the first free place we met
     */
    public void digPitInTheCave(Cave cave) {

        boolean placeFound = false;

        outerCycle:
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                boolean isFree = true;

                for (int k = i; k < sizes.sizeX() + i; k++) {
                    for (int q = j; q < sizes.sizeY() + j; q++) {
                        isFree = isFree && cave.getCellValue(k, q) == 0;
                    }
                }

                if (isFree) {
                    for (int k = i; k < sizes.sizeX() + i; k++) {
                        for (int q = j; q < sizes.sizeY() + j; q++) {
                            cave.setCellValue(k, q, sizes.sizeZ());
                        }
                    }
                    placeFound = true;
                    break outerCycle;
                }
            }
        }

        if (!placeFound) {
            // TODO throwing exception
        }
    }

    private boolean sleepingStatus = false;

    @Override
    public void sleep() {
        sleepingStatus = true;
        System.out.println(getName() + (gender == Gender.MAN ? " уснул" : " уснула"));
    }

    @Override
    public void getUp() {
        sleepingStatus = false;
        System.out.println(getName() + (gender == Gender.MAN ? " проснулся" : " проснулась"));
    }

    @Override
    public boolean getSleepingStatus() {
        return sleepingStatus;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Moomin moomin = (Moomin) object;
        return Objects.equals(name, moomin.name) && gender == moomin.gender && sizes.equals(moomin.sizes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, sizes, sleepingStatus);
    }

    @Override
    public String toString() {
        return getName();
    }
}
