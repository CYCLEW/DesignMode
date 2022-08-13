package 行为型模式.迭代器模式.Iterator;

import 行为型模式.迭代器模式.Sub;

import java.util.ArrayList;

public class SubIte implements ite{
    private ArrayList<Sub> L = new ArrayList<>();

    @Override
    public void ADD(Sub s) {
        L.add(s);
    }

    @Override
    public void FOR() {
        for (Sub s : L){
            System.out.println(s.toString());
        }
    }
}
