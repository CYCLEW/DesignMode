package 结构型模式.适配器模式.对象适配器模式;

import 结构型模式.适配器模式.对象适配器模式.VGA.VGA;

public class VGAProjector {
    public void show(VGA v){
        v.VGAShow();
        System.out.println("VGA projector show");
    }
}
