package locations;

import abilities.AbleToBecomeJungle;

public class MummiHouse extends Location implements AbleToBecomeJungle {

    public MummiHouse() {
        System.out.println("Мумми-дом создан");
    }

    @Override
    public void becomeJungle() {
        System.out.println("Мумми-дом превратился в джунгли");
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
