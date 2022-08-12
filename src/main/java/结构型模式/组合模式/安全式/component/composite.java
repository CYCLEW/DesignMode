package 结构型模式.组合模式.安全式.component;

import java.util.ArrayList;

public class composite implements component {
    private final ArrayList<component> children= new ArrayList<>();
    public void add(component c)
    {
        children.add(c);
    }
    public void remove(component c)
    {
        children.remove(c);
    }
    public component getChild(int i)
    {
        return children.get(i);
    }
    public void operation()
    {
        for(component obj:children) {
            obj.operation();
        }
    }
}
