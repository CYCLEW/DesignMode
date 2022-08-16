package 行为型模式.访问者模式.visitor;

import 行为型模式.访问者模式.element.CompensationElementA;
import 行为型模式.访问者模式.element.CompensationElementB;

public interface visitor {  //访问者接口
    void visit(CompensationElementA element);   //用具体元素的类this指针区分访问者针对不同类的业务逻辑
    void visit(CompensationElementB element);
}
