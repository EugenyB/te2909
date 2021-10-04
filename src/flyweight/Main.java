package flyweight;

public class Main {
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a>b);

        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1==s2);
    }
}
