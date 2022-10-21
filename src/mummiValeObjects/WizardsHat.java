package mummiValeObjects;

import abilities.AbleToMakeJuice;

public class WizardsHat implements AbleToMakeJuice {

    @Override
    public void makeJuice(Water water) {
        water.becomeJuice();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
