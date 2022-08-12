package 创建型模式.单例模式;

/**
 * 预加载
 */
public class PreLoadSingleton {
    private static PreLoadSingleton instance=new PreLoadSingleton();
    private PreLoadSingleton() {

    }
    public static PreLoadSingleton getInstance(){
        return instance;
    }
}
