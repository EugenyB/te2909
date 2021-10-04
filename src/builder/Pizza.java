package builder;

public class Pizza {
    public static class Builder {
        private Pizza pizza;

        public Builder() {
            pizza = new Pizza();
        }

        public Builder diameter(int diameter) {
            pizza.diameter = diameter;
            return this;
        }

        public Builder sausage(int sausage) {
            pizza.sausage = sausage;
            return this;
        }

        public Builder olives(int olives) {
            pizza.olives = olives;
            return this;
        }

        public Builder tomato(int tomato) {
            pizza.tomato = tomato;
            return this;
        }

        public Pizza build() {
            return pizza;
        }
    }

    private Pizza(){}

    private int diameter;

    private int sausage;

    private int olives;

    private int tomato;

    @Override
    public String toString() {
        return "Pizza{" +
                "diameter=" + diameter +
                ", sausage=" + sausage +
                ", olives=" + olives +
                ", tomato=" + tomato +
                '}';
    }
}
