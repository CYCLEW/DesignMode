package 创建型模式.原型模式;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        ProtoType project1=new ProtoType();
        ProtoType project2 = project1.clone();
        System.out.println(project1);
        System.out.println(project2);
    }
}
