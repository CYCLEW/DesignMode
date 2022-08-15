package 结构型模式.外观模式;

import 结构型模式.外观模式.modular.computer;

public class Main {
    public static void main(String[] args) {    //封装子组件逻辑，使外部调用仅关系方法
        computer c=new Computer();
        c.start();
        System.out.println();
        c.writeFile();
        System.out.println();
        c.MachineLearn();
    }
}
