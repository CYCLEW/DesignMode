package 结构型模式.适配器模式.类适配器模式;

import 结构型模式.适配器模式.类适配器模式.VGA.VGA;

public class Main {
    public static void main(String[] args) {
        VGA v=new USBToVGAAdapter();
        VGAProjector proxy = new VGAProjector();
        proxy.show(v);
    }
}
