package 行为型模式.访问者模式.element;

import 行为型模式.访问者模式.visitor.visitor;

public abstract class element {
    public abstract void Accept(visitor visitor);
}
