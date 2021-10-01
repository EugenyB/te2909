package command;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ShutDownCommand shutDown = new ShutDownCommand(computer);
        RestartCommand restart = new RestartCommand(computer);
        Switch sw = new Switch();
        String str = "shutdown"; //
        if ("shutdown".equals(str)) {
            sw.storeAndExec(shutDown);
        } else {
            sw.storeAndExec(restart);
        }
    }
}
