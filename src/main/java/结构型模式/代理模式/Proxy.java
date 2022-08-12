package 结构型模式.代理模式;

import 结构型模式.代理模式.Object.Class;
import 结构型模式.代理模式.Object.ClassA;

public class Proxy implements Class {
    private Class source;
    public Proxy() {
        this.source = new ClassA();
    }

    @Override
    public void Do() {
        source.Do();
        System.out.println("代理者");
    }
}
