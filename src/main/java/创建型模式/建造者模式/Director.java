package 创建型模式.建造者模式;

import 创建型模式.建造者模式.Computer.Computer;
import 创建型模式.建造者模式.ComputerBuilder.ComputerBuilder;

public class Director {
    private ComputerBuilder computerBuilder=null;
    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
    public Computer getComputer() {
        return computerBuilder.getComputer();
    }
    public void constructComputer(){
        computerBuilder.buildComputer();
        computerBuilder.buildCPU();
        computerBuilder.buildGPU();
        computerBuilder.buildPower();
        computerBuilder.buildScreen();
        computerBuilder.buildMotherBoard();
        computerBuilder.buildRAM();
    }
}
