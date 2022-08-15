package 结构型模式.适配器模式.对象适配器模式;

import 结构型模式.适配器模式.对象适配器模式.USB.USB;
import 结构型模式.适配器模式.对象适配器模式.USB.USBImpl;
import 结构型模式.适配器模式.对象适配器模式.VGA.VGA;

public class USBToVGAAdapter implements VGA {   //实现适配类接口
    USB u=new USBImpl();    //内部实例化被适配类
    @Override
    public void VGAShow() {
        u.USBShow();
    }
}
