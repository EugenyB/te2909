package singleton;

public class Singleton {
    private static Singleton instance;
    private int count;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }

    public void doSomething() {
        System.out.println("count = " + ++count);
    }
}
