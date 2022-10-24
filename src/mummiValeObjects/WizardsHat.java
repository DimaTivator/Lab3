package mummiValeObjects;

import abilities.AbleToBePardoned;
import abilities.AbleToMakeJuice;
import humans.Human;
import humans.Wizard;

public class WizardsHat extends Hat implements AbleToMakeJuice, AbleToBePardoned {

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
    public void setOwner(Human owner) {
        if (owner instanceof Wizard) {
            super.setOwner(owner);
        } else {
            System.out.println("Владельцем волшебной шляпы может быть только волшебник!");
        }
    }

    @Override
    public boolean checkPardon() {
        return isPardoned;
    }

    @Override
    public void makePardoned() {
        isPardoned = true;
        System.out.printf("Шляпа волшебника %s помилована\n", getOwner().getName());
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
