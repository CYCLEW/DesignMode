package 结构型模式.适配器模式.对象适配器模式;

public class Main {
    public static void main(String[] args) {
        USBToVGAAdapter v=new USBToVGAAdapter();
        VGAProjector proxy = new VGAProjector();
        proxy.show(v);
    }
}
