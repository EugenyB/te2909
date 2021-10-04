package factory;

public class AmdFactory implements CPUFactory {
    @Override
    public CPU produceCPU() {
        return new Ryzen3();
    }

    @Override
    public ServerCPU produceServerCPU() {
        return new Threadripper();
    }
}
