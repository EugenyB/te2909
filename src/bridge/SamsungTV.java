package bridge;

public class SamsungTV implements ITV {
    @Override
    public void on() {
        System.out.println("Samsung is on");
    }

    @Override
    public void off() {
        System.out.println("Samsung is off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("Samsung: channel - " + channel);
    }
}
