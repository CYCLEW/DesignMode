package 行为型模式.中介者模式.Mediator;

import 行为型模式.中介者模式.Object.object;

public interface mediator {
    void register(object o);
    void relay(String from,String to,String ad);
}
