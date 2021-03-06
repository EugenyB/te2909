package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.doSomething();

        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
        instance.doSomething();
    }
}
