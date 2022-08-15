package 结构型模式.适配器模式.接口适配器模式.Adapter;

import 结构型模式.适配器模式.接口适配器模式.USB.USB;
import 结构型模式.适配器模式.接口适配器模式.USB.USBImpl;
import 结构型模式.适配器模式.接口适配器模式.VGA.VGA;

abstract public class USBToVGAAdapter implements VGA {  //实现适配类接口
    USB u=new USBImpl();        //实例化被适配类
    @Override
    public void VGAShow() {
        u.USBShow();
    }   //方法挂载

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
