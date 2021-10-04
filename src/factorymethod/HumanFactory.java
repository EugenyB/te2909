package factorymethod;

public class HumanFactory {
    public static Human createHuman(String m) {
        return m.equals("boy") ? new Boy() : new Girl();
    }
}
