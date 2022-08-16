package 行为型模式.观察者模式.Observe;

import 行为型模式.观察者模式.Sub.subject;

import java.util.ArrayList;
import java.util.List;

public class obs implements Observe{
    private List<subject> L=new ArrayList<>();
    @Override
    public void Register(subject s) {
        L.add(s);
    }   //注册观察者

    @Override
    public void Notify() {
        for (subject s:L){  //循环调用注册的观察者处理方法
            s.update();
        }
    }
}
