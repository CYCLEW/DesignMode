package 行为型模式.中介者模式.Mediator;

import 行为型模式.中介者模式.Object.object;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements mediator{
    private List<object> list=new ArrayList<>();    //list 管理通信类
    @Override
    public void register(object o) {
        if (!list.contains(o)){
            list.add(o);
            o.setMedium(this);
        }
    }

    @Override
    public void relay(String from, String to, String ad) {
        for (object o:list){
            String name=o.getName();
            if (name.equals(to)){
                o.receive(from, ad);
            }
        }
    }
}
