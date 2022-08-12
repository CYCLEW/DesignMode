package 创建型模式.单例模式;

public class LazyLoadSingleton {
    private static volatile LazyLoadSingleton instance=null;
    private LazyLoadSingleton() {

    }
    public static LazyLoadSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyLoadSingleton.class){
                if (instance == null) {
                    instance = new LazyLoadSingleton();
                }
            }
        }
        return instance;
    }
}
