package 结构型模式.组合模式.安全式;

import 结构型模式.组合模式.安全式.component.component;
import 结构型模式.组合模式.安全式.component.composite;
import 结构型模式.组合模式.安全式.component.leaf;

public class Main {
    public static void main(String[] args) {
        composite c0=new composite();
        composite c1=new composite();
        component leaf1=new leaf("1");
        component leaf2=new leaf("2");
        component leaf3=new leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
        /*
        c0 -leaf1
            -c1 -leaf2
                -leaf3
         */
    }
}
