package MummiValeObjects;

import enums.Weather;
import locations.MummiVale;

public class Tree {

    public Tree() {
        System.out.println("Деревья созданы");
    }

    /**
     * Depending on the type of current weather void outputs the tree's status
     */
    public void checkTrees(MummiVale mummiVale) {
        Weather weather = mummiVale.getWeather();
        switch (weather) {
            case EXTREMELY_HOT -> {
                System.out.println("Деревья изнемогают от страшной жары :(");
            }
            case EXTREMELY_COLD -> {
                System.out.println("Деревья изнемогают от страшного мороза :(");
            }
            default -> {
                System.out.println("Деревья легко переносят эту погоду");
            }
        }
    }
}
