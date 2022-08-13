package 结构型模式.组合模式.安全式.component;

public class leaf implements component {
    private String name;
    public leaf(String name)
    {
        this.name=name;
    }
    public void add(component c){
        System.out.println("leaf add");
    }
    public void remove(component c){
        System.out.println("leaf remove");
    }
    public component getChild(int i) {
        System.out.println("leaf getChild");
        return null;
    }
    public void operation() {
        System.out.println("树叶"+name+"：被访问！");
    }
}
