package org.example.singleton;

/**
 * 单例模式
 */
public class Singleton3 {
    private static volatile Singleton3 singleton;

    /**
     * 构造方法私有化
     */
    private Singleton3() {}

    /**
     * 获取实例（单例）
     */
    public static Singleton3 getInstance() {
        /**
         * 第一次检查
         */
        if (singleton == null) {
            synchronized (Singleton3.class) {
                /**
                 * 获取锁后二次检查
                 */
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}