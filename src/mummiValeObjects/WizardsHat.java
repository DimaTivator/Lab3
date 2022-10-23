package mummiValeObjects;

import abilities.AbleToBePardoned;
import abilities.AbleToMakeJuice;

public class WizardsHat extends MummiValeObject implements AbleToMakeJuice, AbleToBePardoned {

    private boolean isPardoned = false;

    @Override
    public void makeJuice(Water water) {
        if (isPardoned) {
            water.becomeJuice();
        } else {
            System.out.println("Не помилованная шляпа не может превратить воду в сок :(");
        }
    }

    @Override
    public boolean checkPardon() {
        return isPardoned;
    }

    @Override
    public void makePardoned() {
        isPardoned = true;
        System.out.println("Шляпа волшебника %s помилована");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        WizardsHat hat = (WizardsHat) obj;
        return hashCode() == hat.hashCode();
    }

    @Override
    public int hashCode() {
        return (toString() + (isPardoned ? '1' : '0')).hashCode();
    }

    @Override
    public String toString() {
        return "Шляпа волшебника";
    }
}
