package factory;

public class Main {
    public static void main(String[] args) {
        CPUFactory factory = new AmdFactory();
        CPU cpu = factory.produceCPU();
        cpu.process();
    }
}
