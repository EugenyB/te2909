package chainofresp;

public class Main {
    public static void main(String[] args) {
        Chain chain = createChain();
        chain.message("level 2", 2);
        chain.message("level 1", 1);
        chain.message("level 3", 3);
        chain.message("level 4", 4);
    }

    private static Chain createChain() {
        Chain chain1 = new First(1);
        Chain chain2 = new Second(2);
        Chain chain3 = new Third(3);
        chain1.setNext(chain2);
        chain2.setNext(chain3);
        return chain1;
    }
}
