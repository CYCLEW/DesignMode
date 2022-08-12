package 结构型模式.适配器模式.对象适配器模式;

import 结构型模式.适配器模式.对象适配器模式.USB.USB;
import 结构型模式.适配器模式.对象适配器模式.USB.USBImpl;
import 结构型模式.适配器模式.对象适配器模式.VGA.VGA;

public class USBToVGAAdapter implements VGA {
    USB u=new USBImpl();
    @Override
    public void VGAShow() {
        u.USBShow();
    }
}
