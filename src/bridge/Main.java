package bridge;

public class Main {
    public static void main(String[] args) {
        ITV tv = new LgTV();
        LogitechRemote remote = new LogitechRemote(tv);
        remote.setChannelFromKey(121);
    }
}
