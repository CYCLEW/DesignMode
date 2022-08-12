package 创建型模式.原型模式;

public class ProtoType implements Cloneable{
    @Override
    protected ProtoType clone() throws CloneNotSupportedException {
        return (ProtoType) super.clone();
    }
}
