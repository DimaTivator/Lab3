public class Test {
    public static void main(String[] args) {
        Fly a = new Fly(2.2, 3.3, 4.4);
        Fly b = new Fly(2.2, 3.3, 4.4);
        System.out.println(b.hashCode());
        System.out.println(a.hashCode());
    }
}
