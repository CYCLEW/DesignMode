package 结构型模式.适配器模式.接口适配器模式.Adapter;

public class USBToVGAAdapterImpl extends USBToVGAAdapter {  //继承适配类
    @Override
    public void VGAShow() {
        super.VGAShow();
        System.out.println("abstract");
    }
}
