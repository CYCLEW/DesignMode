package 结构型模式.适配器模式.类适配器模式;

import 结构型模式.适配器模式.类适配器模式.USB.USBImpl;
import 结构型模式.适配器模式.类适配器模式.VGA.VGA;

public class USBToVGAAdapter extends USBImpl implements VGA {   //继承被适配类，并实现适配类接口
    @Override
    public void VGAShow() {
        this.USBShow();
    }
}
