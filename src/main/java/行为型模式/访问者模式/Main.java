package 行为型模式.访问者模式;

import 行为型模式.访问者模式.element.CompensationElementA;
import 行为型模式.访问者模式.element.CompensationElementB;
import 行为型模式.访问者模式.visitor.CompensationVisitor;
import 行为型模式.访问者模式.visitor.visitor;

public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        visitor v=new CompensationVisitor();
        objectStructure.add(new CompensationElementA());
        objectStructure.add(new CompensationElementB());
        objectStructure.add(new CompensationElementA());
        objectStructure.accept(v);
    }
}
