package chainofresp;

public class First extends Chain {

    public First(int threshold) {
        this.threshold = threshold;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("First: " + msg);
    }
}
