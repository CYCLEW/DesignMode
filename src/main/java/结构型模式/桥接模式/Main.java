package 结构型模式.桥接模式;

import 结构型模式.桥接模式.shape.circle;
import 结构型模式.桥接模式.shape.color.blue;
import 结构型模式.桥接模式.shape.color.red;
import 结构型模式.桥接模式.shape.rectangle;
import 结构型模式.桥接模式.shape.shape;


public class Main {
    public static void main(String[] args) {
        shape shape1 = new circle();    //主题类
        shape1.setColor(new red());     //red桥接类
        shape1.draw();

        shape shape2 = new rectangle();
        shape2.setColor(new blue());
        shape2.draw();
    }
}
