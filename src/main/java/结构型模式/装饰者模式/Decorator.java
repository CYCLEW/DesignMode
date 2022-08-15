package 结构型模式.装饰者模式;

import 结构型模式.装饰者模式.Object.Class;

public class Decorator implements Class {   //装饰着类
    private Class source;
    public Decorator(Class source) {
        this.source = source;
    }   //外界传递被装饰类

    @Override
    public void Do() {
        source.Do();
        System.out.println("装饰者");  //方法增强
    }
}
