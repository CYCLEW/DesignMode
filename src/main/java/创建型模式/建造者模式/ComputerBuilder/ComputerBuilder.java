package 创建型模式.建造者模式.ComputerBuilder;

import 创建型模式.建造者模式.Computer.Computer;

abstract public class ComputerBuilder {
    protected Computer computer=null;

    @Override
    public String toString() {
        return "ComputerBuilder{" +
                "computer=" + computer +
                '}';
    }

    public Computer getComputer() {
        return computer;
    }
    public void buildComputer(){
        computer=new Computer();
        System.out.println("生成电脑");
    }
    public abstract void buildCPU();
    public abstract void buildGPU();
    public abstract void buildMotherBoard();
    public abstract void buildPower();
    public abstract void buildRAM();
    public abstract void buildScreen();
}
