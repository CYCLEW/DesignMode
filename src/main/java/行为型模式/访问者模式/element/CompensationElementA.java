package 行为型模式.访问者模式.element;

import 行为型模式.访问者模式.visitor.visitor;

public class CompensationElementA extends element{

    @Override
    public void Accept(visitor visitor) {
        visitor.visit(this);
    }

    public void operator(){
        System.out.println("具体元素操作A");
    }
}
