package MummiValeObjects;

import enums.RiverColour;

public class River {

    public River(double waterLevel) {
        this.waterLevel = waterLevel;
        System.out.printf("Создана речка с уровнем воды %.2f(м)", waterLevel);
    }

    private RiverColour riverColour;

    public void setRiverColour(RiverColour riverColour) {
        this.riverColour = riverColour;
    }

    public RiverColour getRiverColour() {
        return riverColour;
    }

    private double waterLevel;

    /**
     * Void changes the water level.
     * If shift is positive, the water level increases.
     * If shift is negative, the water level decreases or becomes 0.
     * Also, void checks whether the river has become shallow.
     */
    public void changeWaterLevel(double shift) {
        if (waterLevel + shift > 0) {
            waterLevel += shift;
        } else {
            waterLevel = 0;
        }

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
        return waterLevel > 1;
    }

    public void flow() {
        if (isShallow()) {
            System.out.println("Речка течет");
        } else {
            System.out.println("Речка еле струится");
        }
    }
}
