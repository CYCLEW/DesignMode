package 行为型模式.访问者模式;

import 行为型模式.访问者模式.element.CompensationElementA;
import 行为型模式.访问者模式.element.CompensationElementB;
import 行为型模式.访问者模式.visitor.CompensationVisitor;
import 行为型模式.访问者模式.visitor.visitor;

public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();    //中间操作类
        visitor v=new CompensationVisitor();    //访问者
        objectStructure.add(new CompensationElementA());    //注册元素类
        objectStructure.add(new CompensationElementB());
        objectStructure.add(new CompensationElementA());
        objectStructure.accept(v);  //访问者访问
    }
}
