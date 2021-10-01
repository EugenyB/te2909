package chainofresp;

public class Third extends Chain {

    public Third(int threshold) {
        this.threshold = threshold;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Third: " + msg);
    }
}
