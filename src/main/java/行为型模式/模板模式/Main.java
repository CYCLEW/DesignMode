package 行为型模式.模板模式;

import 行为型模式.模板模式.AL.DO1;
import 行为型模式.模板模式.AL.DO2;
import 行为型模式.模板模式.AL.Template;

public class Main {
    public static void main(String[] args) {
        Template t1=new DO1();
        t1.done();
        Template t2=new DO2();
        t2.done();
    }
}
