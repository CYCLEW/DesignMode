package 结构型模式.代理模式;

import 结构型模式.代理模式.Object.Class;
import 结构型模式.代理模式.Object.ClassA;

public class Proxy implements Class {   //代理类需实现与被代理类相同的接口口
    private Class source;   //被代理类
    public Proxy() {
        this.source = new ClassA();
    }

    @Override
    public void Do() {
        source.Do();
        System.out.println("代理者");  //代理类增强方法
    }
}
