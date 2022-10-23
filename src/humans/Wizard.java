package humans;

import abilities.AbleToMakeJuice;
import mummiValeObjects.Water;
import mummiValeObjects.WizardsHat;

public class Wizard extends Human implements AbleToMakeJuice {

    private WizardsHat hat;

    public Wizard(String name, WizardsHat hat) {
        this.hat = hat;
        setName(name);
        System.out.printf("Волшебник %s с шляпой создан\n", name);
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
