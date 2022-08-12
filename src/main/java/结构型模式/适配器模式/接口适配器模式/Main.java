package 结构型模式.适配器模式.接口适配器模式;

import 结构型模式.适配器模式.接口适配器模式.Adapter.USBToVGAAdapter;
import 结构型模式.适配器模式.接口适配器模式.Adapter.USBToVGAAdapterImpl;

public class Main {
    public static void main(String[] args) {
        USBToVGAAdapter v=new USBToVGAAdapterImpl();
        VGAProjector proxy = new VGAProjector();
        proxy.show(v);
    }
}
