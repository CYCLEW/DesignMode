package 结构型模式.适配器模式.类适配器模式;

import 结构型模式.适配器模式.类适配器模式.USB.USBImpl;
import 结构型模式.适配器模式.类适配器模式.VGA.VGA;

public class USBToVGAAdapter extends USBImpl implements VGA {
    @Override
    public void VGAShow() {
        this.USBShow();
    }
}
