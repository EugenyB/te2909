package memento;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> userNames = new ArrayList<>(List.of("Ivan", "Petro", "Voldemar", "Masha"));
        List<Integer> userAges = new ArrayList<>(List.of(25, 30, 19, 21));

        Snapshot snapshot = new Snapshot(userNames, userAges);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.dat"))) {
            oos.writeObject(snapshot);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.dat"))) {
            Snapshot s = (Snapshot) ois.readObject();
            List<String> names = s.getNames();
            List<Integer> ages = s.getNums();
            System.out.println(names);
            System.out.println(ages);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
