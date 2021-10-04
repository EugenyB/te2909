package bridge;

public abstract class AbstractRemote {
    private ITV tv;

    public AbstractRemote(ITV tv) {
        this.tv = tv;
    }

    public void on() {
        tv.on();
    }

    public void off() {
        tv.off();
    }

    public void switchChannel(int channel) {
        tv.switchChannel(channel);
    }
}
