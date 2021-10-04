package composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component... component) {
        children.addAll(Arrays.asList(component));
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void show() {
        for (Component component : children) {
            component.show();
        }
    }
}
