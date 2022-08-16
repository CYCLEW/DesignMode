package 行为型模式.访问者模式.element;

import 行为型模式.访问者模式.visitor.visitor;

public class CompensationElementA extends element{

    @Override
    public void Accept(visitor visitor) {
        visitor.visit(this);
    }   //用具体元素的类this指针区分访问者针对不同类的业务逻辑

    public void operator(){
        System.out.println("具体元素操作A");
    }
}
