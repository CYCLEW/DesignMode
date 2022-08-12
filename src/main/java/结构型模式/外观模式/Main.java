package 结构型模式.外观模式;

import 结构型模式.外观模式.modular.computer;

public class Main {
    public static void main(String[] args) {
        computer c=new Computer();
        c.start();
        System.out.println();
        c.writeFile();
        System.out.println();
        c.MachineLearn();
    }
}
