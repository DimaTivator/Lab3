package mummiValeObjects;

import abilities.AbleToBePardoned;
import abilities.AbleToMakeJuice;

public class WizardsHat extends MummiValeObject implements AbleToMakeJuice, AbleToBePardoned {

    @Override
    public void makeJuice(Water water) {
        water.becomeJuice();
    }

    @Override
    public void checkPardon() {
        System.out.printf("Шляпа волшебника %s помилована", (Math.random() > 0.2 ? "" : "не"));
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
