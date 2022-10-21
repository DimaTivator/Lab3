package mummiValeObjects;

public class Chest extends MummiValeObject {
    public Chest() {
        System.out.println("Комод создан");
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
        return String.format("Комод@%d", hashCode());
    }
}
