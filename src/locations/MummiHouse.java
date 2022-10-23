package locations;

public class MummiHouse extends Location {

    public MummiHouse() {
        System.out.println("Мумми-дом создан");
    }

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

    @Override
    public String toString() {
        return "Мумми-дом";
    }
}
