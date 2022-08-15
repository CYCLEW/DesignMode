package 结构型模式.享元模式;

import 结构型模式.享元模式.PUBLIC.PubFactory;
import 结构型模式.享元模式.PUBLIC.pub;

public class Main {
    public static void main(String[] args) {
        PubFactory factory = new PubFactory();  //实例化享元工厂
        pub a = factory.getPub("A");
        pub b = factory.getPub("B");
        pub c = factory.getPub("A");
        System.out.println(b.hashCode()==c.hashCode());
        System.out.println(a.hashCode()==c.hashCode());
    }
}
