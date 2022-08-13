package 行为型模式.观察者模式.Observe;

import 行为型模式.观察者模式.Sub.subject;

public interface Observe {
    void Register(subject s);
    void Notify();
}
