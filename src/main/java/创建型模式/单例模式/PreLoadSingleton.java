package 创建型模式.单例模式;

/**
 * 预加载
 */
public class PreLoadSingleton {
    private static PreLoadSingleton instance=new PreLoadSingleton();    //静态类在程序初始化期间完成加载
    private PreLoadSingleton() {    //私有构造函数使外界不能主动创建对象

    }
    public static PreLoadSingleton getInstance(){
        return instance;
    }
}
