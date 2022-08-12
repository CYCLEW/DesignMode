package 创建型模式.工厂方法模式;

import 创建型模式.工厂方法模式.Factory.AbstractFactory;
import 创建型模式.工厂方法模式.Factory.ClassAFactory;
import 创建型模式.工厂方法模式.Factory.ClassBFactory;
import 创建型模式.工厂方法模式.Object.Class;

public class Main {
    public static void main(String[] args) {
//        AbstractFactory F=new ClassAFactory();
//        Class C=F.createBean();

        AbstractFactory F=new ClassBFactory();
        Class C=F.createBean();
        C.Do();
    }
}
