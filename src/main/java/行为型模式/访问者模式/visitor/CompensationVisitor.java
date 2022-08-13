package 行为型模式.访问者模式.visitor;

import 行为型模式.访问者模式.element.CompensationElementA;
import 行为型模式.访问者模式.element.CompensationElementB;

public class CompensationVisitor implements visitor{
    @Override
    public void visit(CompensationElementA element) {
        System.out.println("具体访问者A");
        element.operator();
    }

    @Override
    public void visit(CompensationElementB element) {
        System.out.println("具体访问者B");
        element.operator();
    }
}
