package 行为型模式.迭代器模式;

import 行为型模式.迭代器模式.Iterator.SubIte;
import 行为型模式.迭代器模式.Iterator.ite;

public class Main {
    public static void main(String[] args) {
        ite i = new SubIte();
        i.ADD(new Sub("a"));
        i.ADD(new Sub("b"));
        i.ADD(new Sub("c"));
        i.FOR();
    }
}
