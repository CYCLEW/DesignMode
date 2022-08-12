package 结构型模式.适配器模式.接口适配器模式.Adapter;

import 结构型模式.适配器模式.接口适配器模式.USB.USB;
import 结构型模式.适配器模式.接口适配器模式.USB.USBImpl;
import 结构型模式.适配器模式.接口适配器模式.VGA.VGA;

abstract public class USBToVGAAdapter implements VGA {
    USB u=new USBImpl();
    @Override
    public void VGAShow() {
        u.USBShow();
    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
