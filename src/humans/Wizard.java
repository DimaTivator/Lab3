package humans;

import abilities.AbleToMakeJuice;
import mummiValeObjects.Water;
import mummiValeObjects.WizardsHat;

public class Wizard extends Human implements AbleToMakeJuice {

    private WizardsHat hat;

    public Wizard(WizardsHat hat) {
        System.out.println("Волшебник с шляпой создан");
        this.hat = hat;
    }

    public void setHat(WizardsHat hat) {
        this.hat = hat;
    }

    public WizardsHat getHat() {
        return hat;
    }

    @Override
    public void makeJuice(Water water) {
        hat.makeJuice(water);
    }

    @Override
    public String toString() {
        return String.format("Волшебник %s", getName());
    }
}
