package visitor;

import java.util.ArrayList;
import java.util.List;

public class City implements Element {
    List<Element> places = new ArrayList<>();

    public City() {
        places.add(new Museum());
        places.add(new Park());
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("City is accepting visitor");
        visitor.visit(this);
        for (Element element : places) {
            element.accept(visitor);
        }
    }
}
