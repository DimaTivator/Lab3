package valeObjects;

import enums.Weather;

// TODO
public class Bird extends ValeObject {

    // the volume of birdsong
    private double volume = 3;

    @Override
    public void feelWeather(Weather weather) {
        switch (weather) {
            case EXTREMELY_HOT -> {
                volume = 0;
                sing();
            }
            case HOT, WARM -> {
                volume = 3;
                sing();
            }
            default -> {
                System.out.println("Мороз. Птицы улетели на юг");
            }
        }
    }

    public void sing() {
        if (volume > 0) {
            for (int i = 0; i < volume; i++) {
                System.out.println("Чик чирик ");
            }
            System.out.println(":-)");
        } else {
            System.out.println("От жары у птиц нет сил петь :(");
        }
    }
}
