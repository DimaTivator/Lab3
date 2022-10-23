package mummiValeObjects;

import abilities.AbleToBeLiquid;
import enums.WaterColour;

public class River extends MummiValeObject implements AbleToBeLiquid {

    Water water = new Water();

    public River(double waterLevel) {
        water.changeWaterLevel(waterLevel);
        System.out.printf("Создана речка с уровнем воды %.2f(м)\n", waterLevel);
    }

    private WaterColour waterColour;

    public void setRiverColour(WaterColour waterColour) {
        water.setWaterColour(waterColour);
    }

    public WaterColour getWaterColour() {
        return waterColour;
    }


    private double waterLevel;

    @Override
    public void changeWaterLevel(double shift) {
        water.changeWaterLevel(shift);

        if (isShallow()) {
            System.out.println("Речка обмелела :(");
        } else {
            System.out.println("Уровень воды в реке " + (shift > 0 ? "увеличился" : "стал ниже"));
        }
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    private boolean isShallow() {
        return waterLevel < 1;
    }

    @Override
    public void flow() {
        if (isShallow()) {
            System.out.println("Речка еле струится");
        } else {
            System.out.println("Речка течет");
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        River river = (River) obj;
        return water.equals(river.water) && toString().equals(river.toString());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s", (isShallow() ? "Река" : "Обмелевшая река"));
    }
}
