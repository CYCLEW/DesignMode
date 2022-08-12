package 结构型模式.桥接模式.shape;

public class circle extends shape{
    @Override
    public void draw() {
        System.out.println("circle");
        color.pain();
    }
}
