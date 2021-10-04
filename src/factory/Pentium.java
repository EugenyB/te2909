package factory;

public class Pentium implements CPU {
    @Override
    public void process() {
        System.out.println("Pentium works");
    }
}
