package 创建型模式.工厂方法模式.Factory;

import 创建型模式.工厂方法模式.Object.Class;
import 创建型模式.工厂方法模式.Object.ClassA;

public class ClassAFactory extends AbstractFactory{ //实现接口
    @Override
    public Class createBean() {
        return new ClassA();
    }
}
