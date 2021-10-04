package decorator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Girl g1 = new AmericanGirl();
        System.out.println(g1.getDescription());
        Science g2 = new Science(g1);
        System.out.println(g2.getDescription());
        Arts g3 = new Arts(g2);
        System.out.println(g3.getDescription());

        Girl g = new Science(new Arts(new AmericanGirl()));
        System.out.println(g.getDescription());
    }
}
