package 结构型模式.外观模式;

import 结构型模式.外观模式.modular.*;

public class Computer implements computer { //外观类
    private final CPU cpu;      //子组件
    private final GPU gpu;
    private final IO io;
    private final RAM ram;

    public Computer(){      //封装子组件逻辑
        cpu = new CPU();
        gpu = new GPU();
        io = new IO();
        ram=new  RAM();
    }

    @Override
    public void MachineLearn() {
        cpu.run();
        gpu.run();
    }

    @Override
    public void writeFile() {
        cpu.run();
        io.run();
    }

    @Override
    public void start() {
        cpu.run();
        io.run();
        ram.run();
    }
}
