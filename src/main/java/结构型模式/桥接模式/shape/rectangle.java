package 结构型模式.桥接模式.shape;

public class rectangle extends shape{
    @Override
    public void draw() {
        System.out.println("rectangle");
        color.pain();
    }
}
