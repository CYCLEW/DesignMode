package 结构型模式.装饰者模式;

import 结构型模式.装饰者模式.Object.Class;

public class Decorator implements Class {
    private Class source;
    public Decorator(Class source) {
        this.source = source;
    }

    @Override
    public void Do() {
        source.Do();
        System.out.println("装饰者");
    }
}
