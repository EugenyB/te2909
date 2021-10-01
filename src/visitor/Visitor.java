package visitor;

public interface Visitor {
    void visit(City city);
    void visit(Museum museum);
    void visit(Park park);
}
