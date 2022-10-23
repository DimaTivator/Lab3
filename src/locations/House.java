package locations;

public class House extends Location {

    private String name = "дом";

    public House(String name) {
        this.name = name;
        System.out.printf("%s создан\n", name);
    }

    public House() {
        System.out.printf("%s создан\n", name);
    }

    public void becomeJungle() {
        System.out.printf("%s превратился в джунгли\n", name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return name.equals(((House) obj).name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
