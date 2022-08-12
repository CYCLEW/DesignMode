package 创建型模式.简单工厂模式;

import 创建型模式.简单工厂模式.Object.ClassA;
import 创建型模式.简单工厂模式.Object.ClassB;
import 创建型模式.简单工厂模式.Object.Class;

public class SimpleFactory {
    public Class CreateClass(String name){
        if ("ClassA".equals(name)) {
            return new ClassA();
        }else if ("ClassB".equals(name)){
            return new ClassB();
        }else{
            return null;
        }
    }
}