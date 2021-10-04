package bridge;

public class LgTV implements ITV {
    @Override
    public void on() {
        System.out.println("LG is on");
    }

    @Override
    public void off() {
        System.out.println("LG is off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("LG: channel - " + channel);
    }
}
