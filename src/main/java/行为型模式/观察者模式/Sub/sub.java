package 行为型模式.观察者模式.Sub;

public class sub implements subject{
    private String s;
    public sub(String s){
        this.s=s;
    }
    @Override
    public void update() {
        System.out.println(s+" sub done");
    }
}
