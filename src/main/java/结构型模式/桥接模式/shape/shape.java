package 结构型模式.桥接模式.shape;

import 结构型模式.桥接模式.shape.color.colorAPI;

abstract public class shape {   //主体抽象类
    protected colorAPI color;

    public void setColor(colorAPI color) {
        this.color = color;
    }

    public abstract void draw();
}
