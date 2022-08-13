package 行为型模式.观察者模式.Observe;

import 行为型模式.观察者模式.Sub.subject;

import java.util.ArrayList;
import java.util.List;

public class obs implements Observe{
    private List<subject> L=new ArrayList<>();
    @Override
    public void Register(subject s) {
        L.add(s);
    }

    @Override
    public void Notify() {
        for (subject s:L){
            s.update();
        }
    }
}
