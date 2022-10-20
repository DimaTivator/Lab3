import enums.Month;
import enums.Weather;
import locations.Meadow;
import locations.MummiHouse;
import locations.MummiVale;

public class Test {
    public static void main(String[] args) {
        MummiVale a = new MummiVale();

        Meadow meadow = new Meadow();

        MummiHouse house = new MummiHouse();

        a.addLocation(meadow);
        a.addLocation(house);

    }
}
