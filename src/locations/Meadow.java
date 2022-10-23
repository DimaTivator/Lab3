package locations;

import abilities.AbleToFeelWeather;
import enums.Weather;

public class Meadow extends Location implements AbleToFeelWeather {

    public Meadow() {
        System.out.println("Луг создан");
    }

    @Override
    public void printStatus(Weather weather) {
        switch (weather) {
            case EXTREMELY_HOT -> {
                System.out.println("Луга жаждут");
            }
            case HOT -> {
                System.out.println("Солнце греет зеленую траву на лугах");
            }
            default -> {
                System.out.println("Погода не влияет на луга");
            }
        }
    }


    @Override
    public boolean equals(Object obj) {
        return getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return "Луг".hashCode();
    }

    @Override
    public String toString() {
        return "Луг";
    }
}
