package 创建型模式.建造者模式;

import 创建型模式.建造者模式.Computer.Computer;
import 创建型模式.建造者模式.ComputerBuilder.ComputerBuilder;
import 创建型模式.建造者模式.ComputerBuilder.MyComputerBuilder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder=new MyComputerBuilder();
        Director director=new Director();
        director.setComputerBuilder(builder);
        director.constructComputer();
        Computer computer=director.getComputer();
        System.out.println(computer.toString());
    }
}
