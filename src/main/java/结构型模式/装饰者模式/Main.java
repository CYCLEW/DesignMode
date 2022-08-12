package 结构型模式.装饰者模式;

import 结构型模式.装饰者模式.Object.Class;
import 结构型模式.装饰者模式.Object.ClassA;

public class Main {
    public static void main(String[] args) {
        Class c=new ClassA();
        Class D=new Decorator(c);
        D.Do();
    }
}
