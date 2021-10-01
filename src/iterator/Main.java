package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,3,4,5,6,8,9,10,12,13,15,16));
//        for (int i = 0; i < list.size();) {
//            if(list.get(i) % 2 != 0) {
//                list.remove(i);
//            } else i++;
//        }
        list.removeIf(v -> v % 2 != 0);
        System.out.println(list);
    }
}
