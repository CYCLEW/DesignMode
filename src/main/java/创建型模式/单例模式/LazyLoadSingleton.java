package 创建型模式.单例模式;

public class LazyLoadSingleton {
    private static volatile LazyLoadSingleton instance=null;    //volatile 关键字防止java创建对象指令重排导致线程安全问题
    private LazyLoadSingleton() {       //私有构造函数使外界不能主动创建对象
    }
    public static LazyLoadSingleton getInstance() {     //两次if判断是否null提高程序加锁与解锁性能
        if (instance == null) {
            synchronized (LazyLoadSingleton.class){ //加锁线程安全
                if (instance == null) {
                    instance = new LazyLoadSingleton();
                }
            }
        }
        return instance;
    }
}
