package 行为型模式.访问者模式;

import 行为型模式.访问者模式.element.element;
import 行为型模式.访问者模式.visitor.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<element> list = new ArrayList<>();

    public void accept(visitor visitor) {
        for (element element : list) {
            element.Accept(visitor);
        }
    }

    public void add(element element) {
        list.add(element);
    }
}
