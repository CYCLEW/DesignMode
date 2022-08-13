package 行为型模式.访问者模式.visitor;

import 行为型模式.访问者模式.element.CompensationElementA;
import 行为型模式.访问者模式.element.CompensationElementB;

public interface visitor {
    void visit(CompensationElementA element);
    void visit(CompensationElementB element);
}
