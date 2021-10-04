package adapter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Calculator calc = new CalculatorImpl();
        int gcd = calc.gcd(a, b);
        System.out.println("gcd = " + gcd);
    }
}
