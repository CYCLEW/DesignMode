package 结构型模式.享元模式.PUBLIC;

import java.util.HashMap;
import java.util.Map;

public class PubFactory {
    private Map<String,pub> map=new HashMap<>();
    public pub getPub(String str){
        pub p = this.map.get(str);
        if (p==null){
            p=new ConcretePub();
            this.map.put(str, p);
        }
        return p;
    }
}
