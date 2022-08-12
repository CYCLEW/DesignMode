package 创建型模式.建造者模式.Computer;

public class Computer {
    public String Screen;
    public String CPU;
    public String MotherBoard;
    public String RAM;
    public String GPU;
    public String Power;

    public void setScreen(String screen) {
        Screen = screen;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setMotherBoard(String motherBoard) {
        MotherBoard = motherBoard;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setPower(String power) {
        Power = power;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Screen='" + Screen + '\'' +
                ", CPU='" + CPU + '\'' +
                ", MotherBoard='" + MotherBoard + '\'' +
                ", RAM='" + RAM + '\'' +
                ", GPU='" + GPU + '\'' +
                ", Power='" + Power + '\'' +
                '}';
    }
}
