package locations;

import enums.Month;
import enums.Weather;

public class MummiVale extends Location {

    public MummiVale() {
        System.out.println("Мумми-Дол создана");
    }

    public MummiVale(Month month, Weather weather) {
        this.month = month;
        this.weather = weather;
        System.out.printf("Мумми-Дол создана. Месяц: %s, погода: %s\n", month.getTranslation(), weather.getTranslation());
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
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Мумми-Дол@%d. Месяц: %s. Погода: %s", hashCode(), month.getTranslation(), weather.getTranslation());
    }
}
