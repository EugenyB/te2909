package memento;

import java.io.Serializable;
import java.util.List;

public class Snapshot implements Serializable {
    private final List<String> names;
    private final List<Integer> nums;

    public Snapshot(List<String> names, List<Integer> nums) {
        this.names = names;
        this.nums = nums;
    }

    public List<String> getNames() {
        return names;
    }

    public List<Integer> getNums() {
        return nums;
    }
}
