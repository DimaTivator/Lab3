package mummiValeObjects;

import abilities.AbleToMakeJuice;

public class Wizard extends MummiValeObject implements AbleToMakeJuice {

    private WizardsHat hat;

    public Wizard(WizardsHat hat) {
        System.out.println("Волшебник с шляпой создан");
        this.hat = hat;
    }

    @Override
    public void makeJuice(Water water) {
        hat.makeJuice(water);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Волшебник@%d", hashCode());
    }
}
