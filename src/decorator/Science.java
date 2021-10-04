package decorator;

public class Science extends GirlDecorator {
    private Girl girl;

    public Science(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+Like Science";
    }

    public void calculate() {
        System.out.println("Scientific calculation");
    }
}
