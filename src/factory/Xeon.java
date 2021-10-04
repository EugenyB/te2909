package factory;

public class Xeon implements ServerCPU {
    @Override
    public void process() {
        System.out.println("Xeon works");
    }
}
