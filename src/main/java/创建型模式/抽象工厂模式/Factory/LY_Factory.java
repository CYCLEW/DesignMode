package 创建型模式.抽象工厂模式.Factory;

import 创建型模式.抽象工厂模式.Object.ClassA;
import 创建型模式.抽象工厂模式.Object.ClassB;
import  创建型模式.抽象工厂模式.Object.Class;

public class LY_Factory extends AbstractFactory {
    @Override
    public Class createBean(String name) {
        System.out.println("LY");
        if ("ClassA".equals(name)) {
            return new ClassA();
        }else if ("ClassB".equals(name)){
            return new ClassB();
        }else{
            return null;
        }
    }
}
