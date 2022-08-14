package 创建型模式.原型模式;

public class ProtoType implements Cloneable{        //实现Cloneable接口
    @Override
    protected ProtoType clone() throws CloneNotSupportedException { //重写clone方法
        return (ProtoType) super.clone();
    }
}
