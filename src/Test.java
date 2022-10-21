import enums.Month;
import enums.Weather;
import locations.Location;
import locations.Meadow;
import locations.MummiHouse;
import locations.MummiVale;
import mummiValeObjects.Fly;
import mummiValeObjects.River;
import mummiValeObjects.Water;

public class Test {
    public static void main(String[] args) {
        MummiVale a = new MummiVale(Month.JULY, Weather.EXTREMELY_HOT);

//        Meadow meadow = new Meadow();
//
//        MummiHouse house = new MummiHouse();
//
//        a.addLocation(meadow);
//        a.addLocation(house);

//        Location meadow = new Meadow();
//
//        System.out.println(meadow.toString());
        River r = new River(3);
        System.out.println(r.toString());

        Fly f = new Fly(1, 1, 1);
        System.out.println(f.toString());

        Water w = new Water();
        System.out.println(w.toString());
    }
}
