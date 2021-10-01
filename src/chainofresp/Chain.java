package chainofresp;

public abstract class Chain {
    protected int threshold;
    protected Chain next;

    public void setNext(Chain next) {
        this.next = next;
    }

    public void message(String msg, int priority) {
        if (priority <= threshold) {
            writeMessage(msg);
        } else {
            if (next!=null) {
                next.message(msg, priority);
            }
        }
    }

    abstract protected void writeMessage(String msg);
}
