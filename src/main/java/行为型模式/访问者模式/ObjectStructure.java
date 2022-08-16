package 行为型模式.访问者模式;

import 行为型模式.访问者模式.element.element;
import 行为型模式.访问者模式.visitor.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {      //中间操作元素类
    private List<element> list = new ArrayList<>(); //管理所有元素

    public void accept(visitor visitor) {
        for (element element : list) {
            element.Accept(visitor);    //访问者处理
        }
    }

    public void add(element element) {
        list.add(element);
    }
}
