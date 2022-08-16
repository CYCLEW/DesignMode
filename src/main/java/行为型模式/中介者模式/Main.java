package 行为型模式.中介者模式;

import 行为型模式.中介者模式.Mediator.ConcreteMediator;
import 行为型模式.中介者模式.Mediator.mediator;
import 行为型模式.中介者模式.Object.ConcreteObject;
import 行为型模式.中介者模式.Object.object;

public class Main {
    public static void main(String[] args) {
        mediator m=new ConcreteMediator();
        object o1=new ConcreteObject("A");  //给与通信唯一id标识符
        object o2=new ConcreteObject("B");
        m.register(o1); //注册对象
        m.register(o2);
        o1.Send("B","message");
        o2.Send("A","message");
    }
}
