package 创建型模式.简单工厂模式;


import 创建型模式.简单工厂模式.Object.Class;

public class Main {
    public static void main(String[] args) {
        SimpleFactory F=new SimpleFactory();
//        Class C=F.CreateClass("ClassA");
        Class C=F.CreateClass("ClassB");
        C.Do();
    }
}
