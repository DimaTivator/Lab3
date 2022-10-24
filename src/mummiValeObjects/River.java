package mummiValeObjects;

import abilities.AbleToBeLiquid;
import enums.WaterColour;

public class River extends MummiValeObject implements AbleToBeLiquid {

    public Water water = new Water();

    public River(double waterLevel) {
        water.changeWaterLevel(waterLevel);
        System.out.printf("Создана речка с уровнем воды %.2f(м)\n", waterLevel);
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
    public String flow() {
        if (isShallow()) {
            return this + " еле струится";
        } else {
            return this + " течет";
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
        if (isShallow()) {
            return "обмелевшая " + water.getWaterColour().getTranslation() + " река";
        } else {
            return water.getWaterColour().getTranslation() + " река";
        }
    }
}
