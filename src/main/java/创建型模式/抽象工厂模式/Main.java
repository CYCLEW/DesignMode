package 创建型模式.抽象工厂模式;

import 创建型模式.抽象工厂模式.Factory.AbstractFactory;
import 创建型模式.抽象工厂模式.Factory.LY_Factory;
import 创建型模式.抽象工厂模式.Factory.NY_Factory;
import 创建型模式.抽象工厂模式.Object.Class;

public class Main {
    public static void main(String[] args) {
//        AbstractFactory F=new LY_Factory();
        AbstractFactory F=new NY_Factory();

        Class C=F.createBean("ClassA");
//        Class C=F.createBean("ClassB");
        C.Do();
    }
}
