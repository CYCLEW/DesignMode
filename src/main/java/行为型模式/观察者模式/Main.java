package 行为型模式.观察者模式;

import 行为型模式.观察者模式.Observe.Observe;
import 行为型模式.观察者模式.Observe.obs;
import 行为型模式.观察者模式.Sub.sub;
import 行为型模式.观察者模式.Sub.subject;

public class Main {
    public static void main(String[] args) {
        Observe o=new obs();    //观察者工厂
        subject s1=new sub("a");    //观察者类
        subject s2=new sub("b");
        subject s3=new sub("c");
        o.Register(s1);
        o.Register(s2);
        o.Register(s3);
        o.Notify(); //调用处理
    }
}
