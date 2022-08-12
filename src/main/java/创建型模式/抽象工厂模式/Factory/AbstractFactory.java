package 创建型模式.抽象工厂模式.Factory;

import 创建型模式.抽象工厂模式.Object.Class;

abstract public class AbstractFactory {
    abstract public Class createBean(String name);
}
