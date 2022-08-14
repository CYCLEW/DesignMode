package 创建型模式.单例模式;

public class Main {
    public static void main(String[] args) {
        //饿汉式加载
        System.out.println(PreLoadSingleton.getInstance().hashCode()==PreLoadSingleton.getInstance().hashCode());

        //懒汉式加载
        System.out.println(LazyLoadSingleton.getInstance());
        System.out.println(LazyLoadSingleton.getInstance());
    }
}
