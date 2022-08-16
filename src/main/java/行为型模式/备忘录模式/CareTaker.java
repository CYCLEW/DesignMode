package 行为型模式.备忘录模式;

import 行为型模式.备忘录模式.memory.memory;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {    //对象管理类
    private List<memory> mementoList=new ArrayList<>();
    public void add(memory memento){
        mementoList.add(memento);
    }
    public memory get(int index){
        return mementoList.get(index);
    }
}
