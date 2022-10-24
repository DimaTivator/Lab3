package mummiValeObjects;

import humans.Human;

public abstract class Hat extends MummiValeObject {

    private Human owner;

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public Human getOwner() {
        return owner;
    }
}
