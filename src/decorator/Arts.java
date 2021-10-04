package decorator;

public class Arts extends GirlDecorator {
    private Girl girl;

    public Arts(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+Like Art";
    }

    public void draw() {
        System.out.println("Draw pictures");
    }
}
