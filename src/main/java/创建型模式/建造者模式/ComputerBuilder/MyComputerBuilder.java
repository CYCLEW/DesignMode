package 创建型模式.建造者模式.ComputerBuilder;

public class MyComputerBuilder extends ComputerBuilder{
    @Override
    public void buildCPU() {
        computer.setCPU("i9-12900kf");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("RTX 3090Ti");
    }

    @Override
    public void buildMotherBoard() {
        computer.setMotherBoard("ROG STRIX Z690-A GAMING 吹雪");
    }

    @Override
    public void buildPower() {
        computer.setPower("ROG THDR 1200W");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("金士顿 FURY DDR5 5200hz 16G *4");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("AUSU 4K 144hz");
    }
}
