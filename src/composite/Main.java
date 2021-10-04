package composite;

public class Main {
    public static void main(String... args) {
        Leaf leaf1 = new Leaf("1");
        Leaf leaf2 = new Leaf("2");
        Leaf leaf3 = new Leaf("3");
        Leaf leaf4 = new Leaf("4");
        Leaf leaf5 = new Leaf("5");
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.add(leaf1, leaf2, composite2);
        composite2.add(leaf3, leaf4, leaf5);

        composite1.show();
    }
}
