package 结构型模式.组合模式.透明式.component;

public interface component {
    public void add(component c);
    public void remove(component c);
    public component getChild(int i);
    public void operation();
}
