package 行为型模式.模板模式.AL;

public abstract class Template {
    public void done(){
        a();
        b();
        c();
    }

    abstract void a();

    abstract void b();

    abstract void c();
}
