package mummiValeObjects;

import abilities.AbleToBeLiquid;
import abilities.AbleToBecomeJuice;
import enums.WaterColour;
import enums.Weather;

import java.util.Objects;

public class Water extends MummiValeObject implements AbleToBeLiquid, AbleToBecomeJuice {

    private boolean ableToBecomeJuice = false;

    public Water(Weather weather) {
        ableToBecomeJuice = !weather.equals(Weather.EXTREMELY_HOT);
    }

    public Water() {};

    private double waterLevel = 0;

    @Override
    public void changeWaterLevel(double shift) {
        if (waterLevel + shift > 0) {
            waterLevel += shift;
        } else {
            waterLevel = 0;
        }
    }

    public double getWaterLevel() {
        return waterLevel;
    }


    private WaterColour waterColour = WaterColour.TRANSPARENT;

    public void setWaterColour(WaterColour waterColour) {
        this.waterColour = waterColour;
    }

    public WaterColour getWaterColour() {
        return waterColour;
    }


    @Override
    public void flow() {};

    @Override
    public void becomeJuice() {
        if (ableToBecomeJuice) {
            waterColour = WaterColour.ORANGE;
            System.out.println("Магия! Вода превратилась в апельсиновый сок!");
        } else {
            System.out.println("От невыносимой жары вода не может превратиться в сок :(");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Water water = (Water) obj;
        return Double.compare(water.waterLevel, waterLevel) == 0 && waterColour == water.waterColour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(waterLevel, waterColour);
    }

    @Override
    public String toString() {
        return String.format("Вода@%d. Цвет: %s", hashCode(), waterColour.getTranslation());
    }
}
