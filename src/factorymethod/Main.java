package factorymethod;

public class Main {
    public static void main(String[] args) {
        Human boy = HumanFactory.createHuman("qwe");
        boy.talk();
    }
}
