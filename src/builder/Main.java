package builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder().diameter(30).olives(10).sausage(15).tomato(5).build();
        System.out.println(pizza);
    }
}
