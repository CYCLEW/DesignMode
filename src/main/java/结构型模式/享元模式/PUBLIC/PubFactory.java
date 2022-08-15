package 结构型模式.享元模式.PUBLIC;

import java.util.HashMap;
import java.util.Map;

public class PubFactory {
    private Map<String,pub> map=new HashMap<>();    //map集合确保享元类的唯一性
    public pub getPub(String str){
        pub p = this.map.get(str);  //获取享元类
        if (p==null){
            p=new ConcretePub();
            this.map.put(str, p);   //存储享元类
        }
        return p;
    }
}
