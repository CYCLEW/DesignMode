package 行为型模式.模板方法模式.AL;

public abstract class Template {    //抽象类
    public void done(){     //模板方法抽象的业务逻辑
        a();
        b();
        c();
    }

    abstract void a();

    abstract void b();

    abstract void c();
}
