package locations;

import enums.Month;
import enums.Weather;

public class Vale extends Location {

    public Vale(String name) {
        setName(name);
        System.out.printf("%s создана\n", name);
        printInfo();
    }

    public Vale() {
        System.out.printf("%s создана\n", getName());
        printInfo();
    }

    public Vale(String name, Month month, Weather weather) {
        this.month = month;
        this.weather = weather;
        setName(name);
        System.out.printf("%s создана.\n", name);
        printInfo();
    }


    private void printInfo() {
        System.out.printf("Месяц: %s, погода: %s\n", month.getTranslation(), weather.getTranslation());
    }


    // current weather
    private Weather weather = Weather.WARM;

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Weather getWeather() {
        return weather;
    }

    // current month
    private Month month = Month.MAY;

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return getName().equals(((Vale) obj).getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public String toString() {
        return getName();
    }
}
