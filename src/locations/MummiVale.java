package locations;

import enums.Month;
import enums.Weather;
import mummiValeObjects.MummiValeObject;

import java.util.ArrayList;

public class MummiVale extends Location{

    public MummiVale() {
        System.out.println("Мумми-Дол создана");
    }

    // current weather
    private Weather weather;

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Weather getWeather() {
        return weather;
    }

    // current month
    private Month month;

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }


    private ArrayList<Location> locations = new ArrayList<>();

    public void addLocation(Location location) {
        locations.add(location);
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }


    private ArrayList<MummiValeObject> mummiValeObjects = new ArrayList<>();

    public void addMummiValeObject(MummiValeObject object) {
        mummiValeObjects.add(object);
    }

    public ArrayList<MummiValeObject> getMummiValeObjects() {
        return mummiValeObjects;
    }


    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
