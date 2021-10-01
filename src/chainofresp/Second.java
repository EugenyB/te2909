package chainofresp;

public class Second extends Chain {

    public Second(int threshold) {
        this.threshold = threshold;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Second: " + msg);
    }
}
