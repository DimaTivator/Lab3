package locations;

import abilities.AbleToFeelWeather;
import enums.Weather;

public class Meadow extends Location implements AbleToFeelWeather {

    public Meadow() {
        System.out.println("Луг создан");
    }

    @Override
    public void checkStatus(Weather weather) {
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
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Луг";
    }
}
