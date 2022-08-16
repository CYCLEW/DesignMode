package 行为型模式.观察者模式.Observe;

import 行为型模式.观察者模式.Sub.subject;

public interface Observe {  //观察者工厂接口
    void Register(subject s);
    void Notify();
}
