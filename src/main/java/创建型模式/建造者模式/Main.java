package 创建型模式.建造者模式;

import 创建型模式.建造者模式.Computer.Computer;
import 创建型模式.建造者模式.ComputerBuilder.ComputerBuilder;
import 创建型模式.建造者模式.ComputerBuilder.MyComputerBuilder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder=new MyComputerBuilder();    //实例化自己实现的处理流程
        Director director=new Director();       //实例化处理器
        director.setComputerBuilder(builder);   //载入处理流程
        director.constructComputer();   //处理
        Computer computer=director.getComputer();   //获取处理后的类实例
        System.out.println(computer.toString());
    }
}
