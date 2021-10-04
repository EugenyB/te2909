package bridge;

public class LogitechRemote extends AbstractRemote {
    public LogitechRemote(ITV tv) {
        super(tv);
    }

    public void setChannelFromKey(int channel) {
        switchChannel(channel);
        System.out.println("Logitech use keyboard");
    }
}
