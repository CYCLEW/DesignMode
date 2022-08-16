package 行为型模式.访问者模式.element;

import 行为型模式.访问者模式.visitor.visitor;

public abstract class element { //具体元素接口
    public abstract void Accept(visitor visitor);   //访问者处理接口
}
