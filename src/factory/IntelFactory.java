package factory;

public class IntelFactory implements CPUFactory {
    @Override
    public CPU produceCPU() {
        return new Pentium();
    }

    @Override
    public ServerCPU produceServerCPU() {
        return new Xeon();
    }
}
